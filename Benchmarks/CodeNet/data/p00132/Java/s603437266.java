import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		// パズルデータ取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList list = new ArrayList<Piece>();
		int height = Integer.parseInt(br.readLine().split(" ")[0]);
		String[] data = new String[height];
		for (int i = 0; i < height; i++) {
			data[i] = br.readLine();
		}
		int numPieces = Integer.parseInt(br.readLine());
		for (int i = 0; i < numPieces; i++) {
			int h = Integer.parseInt(br.readLine().split(" ")[0]);
			String[] d = new String[h];
			for (int j = 0; j < h; j++) {
				d[j] = br.readLine();
			}
			list.add(new Piece(d));
		}
		int numCombinations = Integer.parseInt(br.readLine());
		for (int i = 0; i < numCombinations; i++) {
			String[] input = br.readLine().split(" ");
			int piecesSelected = Integer.parseInt(input[0]);
			ArrayList selection = new ArrayList<Piece>(piecesSelected);
			for (int j = 0; j < piecesSelected; j++) {
				selection.add(list.get(Integer.parseInt(input[j + 1]) - 1));
			}
			Board board = new Board(data, selection);
			System.out.println((board.solve()) ? "YES" : "NO");
		}
	}
}

final class Board extends Piece {
	int width;
	int height;
	private Piece[] piece;

	public Board(String[] dataStr, ArrayList<Piece> list) {
		super(dataStr);
		this.width = super.width;
		this.height = super.height;
		setPiece(list);
	}

	public Piece[] getPiece() {
		return this.piece;
	}

	public Board clone(ArrayList<Piece> list) {
		return new Board(this.getData(), list);
	};

	@Override
	protected Object clone() throws CloneNotSupportedException {
		ArrayList list = new ArrayList<Piece>();
		for (Piece p : this.piece) {
			list.add(p);
		}
		return new Board(this.getData(), list);
	};

	public boolean isFull() {
		String[] data = super.getData();
		for (String row : data) {
			if (row.contains("0"))	return false;
		}
		return true;
	}

	public void setPiece(ArrayList<Piece> list) {
		Object[] o = list.toArray();
		Arrays.sort(o, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Piece) o2).area - ((Piece) o1).area;
			}
		});
		this.piece = new Piece[list.size()];
		for (int i = 0; i < o.length; i++) {
			this.piece[i] = (Piece) (o[i]);
		}
	}

	public boolean solve() {
		if (!hasSameAreaPieces())
			return false;
		boolean matched = false;
		try {
			matched = tryMatching(this);
		} catch (CloneNotSupportedException e) {
			System.out.println(e);
			System.exit(1);
		}
		return matched;
	}

	private boolean tryMatching(Board board) throws CloneNotSupportedException {
		if (board.getPiece().length == 1) {
			Board b = board.match(board.getPiece()[0]);
			return ((b != null) && b.isFull());
		}
		// ピースが複数あるとき
		for (int i = 0; i < board.getPiece().length; i++) {
			// 盤面をコピーしてピースがはまるか検証する
			Board b = board.match(board.getPiece()[i]);
			if ((b != null)) {
				ArrayList list = new ArrayList<Piece>();
				for (Piece piece : board.getPiece()) {
					list.add(piece);
				}
				list.remove(i);
				// あるピースをはめた後にピースがはめきるか
				if (tryMatching(b.clone(list))) {
					return true;
				}
			}
		}
		// boardの持つ全てのピースがはまらない
		return false;
	}

	private boolean hasSameAreaPieces() {
		int emptyArea = this.width * this.height - this.area;
		int area = 0;
		for (Piece p : this.piece) {
			area += p.area;
		}
		return (emptyArea == area) ? true : false;
	}

	private Board match(Piece p)
			throws CloneNotSupportedException {
		for (int y = 0; y + p.height <= this.height; y++) {
			for (int x = 0; x + p.width <= this.width; x++) {
				Piece[] pieceRotated = p.getPiecesRotated();
				for (Piece pr : pieceRotated) {
					Piece source = subBoard(x, y, pr.width, pr.height);
					if (source == null)
						continue;
					if (source.isSuitable(pr)) {
						return update(x, y,
								source.getXORPiece(pr));
					}
				}
			}
		}
		return null;
	}

	private Board update(int x, int y, Piece p)
			throws CloneNotSupportedException {
		Board b = (Board) this.clone();
		for (int i = 0; i < p.height; i++) {
			b.getData()[y + i] = super.getData()[y + i]
					.substring(0, x)
					+ p.getData()[i]
					+ super.getData()[y + i].substring(x + p.width, super.width);
		}
		return b;
	}

	private Piece subBoard(int x, int y, int width,
			int height) {
		String[] subData = new String[height];
		if (x + width > this.width || y + height > this.height)
			return null;
		for (int i = 0; i < height; i++) {
			subData[i] = super.getData()[y + i].substring(x, x + width);
		}
		return new Piece(subData);
	}
}

class Piece {
	static final char NOT_EXIST = '0';
	static final char EXIST = '1';
	String fill;
	int area;
	int width;
	int height;
	private String[] data;

	public Piece(String[] dataStr) {
		this.width = dataStr[0].length();
		this.height = dataStr.length;
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < this.width; i++) {
			buf.append("1");
		}
		this.data = new String[this.height];
		setData(dataStr);
		this.area = getArea();
	}

	private int getArea() {
		int area = 0;
		for (String d : this.data) {
			for (int i = 0; i < this.data[0].length(); i++) {
				if (d.charAt(i) == EXIST)	area++;
			}
		}
		return area;
	}

	public String[] getData() {
		return this.data;
	}

	private void setData(String[] data) {
		for (int i = 0; i < data.length; i++) {
			this.data[i] = data[i].replace('.', NOT_EXIST).replace('#', EXIST);
		}
	}

	public Piece[] getPiecesRotated() {
		Piece[] piece = new Piece[4];
		piece[0] = new Piece(this.data);
		piece[1] = piece[0].rotate90();
		piece[2] = piece[1].rotate90();
		piece[3] = piece[2].rotate90();
		return piece;
	}

	private Piece rotate90() {
		String[] dataRotated = new String[this.width];
		int c = 0;
		for (int row = this.width - 1; row >= 0; row--) {
			StringBuffer sbuf = new StringBuffer();
			for (int line = 0; line < this.height; line++) {
				sbuf.append(this.data[line].charAt(row));
			}
			dataRotated[c++] = sbuf.toString();
		}
		return new Piece(dataRotated);
	}

	/**
	 * 判定のためのXORピース生成
	 */
	public Piece getXORPiece(Piece p) {
		String[] xorPiece = new String[p.getData().length];
		for (int i = 0; i < p.height; i++) {
			int row = Integer.parseInt(this.data[i], 2)	^ Integer.parseInt(p.getData()[i], 2);
			xorPiece[i] = Integer.toBinaryString(row);
			StringBuffer buf = new StringBuffer();
			for (int j = xorPiece[i].length(); j < p.width; j++) {
				buf.append("0");
			}
			buf.append(xorPiece[i]);
			xorPiece[i] = buf.toString();
		}
		return new Piece(xorPiece);
	}

	/**
	 * 判定のためのANDピース生成
	 */
	private Piece getANDPiece(Piece p) {
		String[] andPiece = new String[p.getData().length];
		for (int i = 0; i < p.height; i++) {
			int row = Integer.parseInt(this.data[i], 2)	& Integer.parseInt(p.getData()[i], 2);
			andPiece[i] = Integer.toBinaryString(row);
			StringBuffer buf = new StringBuffer();
			for (int j = andPiece[i].length(); j < p.width; j++) {
				buf.append("0");
			}
			buf.append(andPiece[i]);
			andPiece[i] = buf.toString();
		}
		return new Piece(andPiece);
	}

	/**
	 * ピースが盤面にはめられるか判定する
	 */
	public boolean isSuitable(Piece p) {
		// 自身とpのXOR演算結果を取得
		Piece xorPiece = getXORPiece(p);
		// 自身とXOR演算結果のAND演算結果を取得
		Piece andPiece = getANDPiece(xorPiece);
		// 上の演算結果と自身が等しければはまる
		for (int i = 0; i < p.height; i++) {
			if (this.data[i].compareTo(andPiece.getData()[i]) != 0) {
				return false;
			}
		}
		return true;
	}

	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < this.data.length; i++) {
			buf.append(this.data[i].toString()
					.replace(NOT_EXIST, '.')
					.replace(EXIST, '#'));
			buf.append("\n");
		}
		return buf.toString();
	}
}