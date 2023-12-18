
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException{
		//パズルデータ取得
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Piece> list = new ArrayList<>();
		int height = Integer.parseInt(br.readLine().split(" ")[0]);
		String[] data = new String[height];
		for(int i = 0; i < height; i++){
			data[i] = br.readLine();
		}
		int numPieces = Integer.parseInt(br.readLine());
		for(int i = 0; i < numPieces; i++){
			int h = Integer.parseInt(br.readLine().split(" ")[0]);
			String[] d = new String[h];
			for(int j = 0; j < h; j++){
				d[j] = br.readLine();
			}
			list.add(new Piece(d));
		}
		int numCombinations = Integer.parseInt(br.readLine());
		for(int i = 0; i < numCombinations; i++){
			String[] input = br.readLine().split(" ");
			int piecesSelected = Integer.parseInt(input[0]);
			ArrayList<Piece> selection = new ArrayList<>(piecesSelected);
			for(int j = 0; j < piecesSelected; j++){
				selection.add(list.get(Integer.parseInt(input[j + 1]) - 1));
			}
			Board board = new Board(data, selection);
			System.out.println((board.solve())? "YES" : "NO");
		}
	}

}

class Board extends Piece{
	final int width;
	final int height;
	private Piece[] piece;
	public Board(String[] dataStr, ArrayList<Piece> list) {
		super(dataStr);
		width = super.width;
		height = super.height;
		setPiece(list);
	}
	public boolean isFull(){
		String[] data = super.getData();
		for(String row : data){
			if(row.contains("0"))	return false;
		}
		return true;
	}
	public void setPiece(ArrayList<Piece> list){
		Object[] o = list.toArray();
		Arrays.sort(o, new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Piece)o2).area - ((Piece)o1).area;
			}
		});
		piece = new Piece[list.size()];
		for(int i = 0; i < o.length; i++){
			piece[i] = (Piece)(o[i]);
		}
	}
	public boolean solve(){
		boolean foundPieceMatched = false;
		for(Piece p : piece){
			foundPieceMatched = false;
			Piece[] pieceRotated = p.getPiecesRotated();
			for(Piece pr : pieceRotated){
				if(match(pr)){
					foundPieceMatched = true;
					break;
				}
			}
			if(!foundPieceMatched)	return false;
		}
		return this.isFull();
	}
	private boolean match(Piece p){
		for(int y = 0; y + p.height <= this.height; y++){
			for(int x = 0; x + p.width <= this.width; x++){
				Piece source = subBoard(x, y, p.width, p.height);
				if(source.isSuitable(p)){
					update(x, y, source.getXORPiece(p));
					return true;
				}
			}
		}
		return false;
	}
	private void update(int x, int y, Piece p){
		for(int i = 0; i < p.height; i++){
			super.getData()[y + i] =
					super.getData()[y + i].substring(0, x) +
					p.getData()[i] +
					super.getData()[y + i].substring(x + p.width, super.width);
		}
	}
	private Piece subBoard(int x, int y, int width, int height){
		String[] subData = new String[height];
		for(int i = 0; i < height; i++){
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
		width = dataStr[0].length();
		height = dataStr.length;
		StringBuffer buf = new StringBuffer();
		for(int i = 0; i < width; i++){
			buf.append("1");
		}
		fill = buf.toString();
		data = new String[height];
		setData(dataStr);
		area = getArea();
	}
	
	private int getArea(){
		int area = 0;
		for(String d : data){
			for(int i = 0; i < data[0].length(); i++){
				if(d.charAt(i) == EXIST) area++;
			}
		}
		return area;
	}
	
	public String[] getData() {
		return data;
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
		String[] dataRotated = new String[width];
		int c = 0;
		for (int row = width - 1; row >= 0; row--) {
			StringBuffer sbuf = new StringBuffer();
			for (int line = 0; line < height; line++) {
				sbuf.append(data[line].charAt(row));
			}
			dataRotated[c++] = sbuf.toString();
		}
		return new Piece(dataRotated);
	}
	/**
	 * 判定のためのXORピース生成
	 */
	public Piece getXORPiece(Piece p){
		String[] xorPiece = new String[p.getData().length];
		for(int i = 0; i < p.height; i++){
			int row = Integer.parseInt(this.data[i], 2) ^ Integer.parseInt(p.getData()[i], 2);
			xorPiece[i] = Integer.toBinaryString(row);
			StringBuffer buf = new StringBuffer();
			for(int j = xorPiece[i].length(); j < p.width; j++){
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
	private Piece getANDPiece(Piece p){
		String[] andPiece = new String[p.getData().length];
		for(int i = 0; i < p.height; i++){
			int row = Integer.parseInt(this.data[i], 2) & Integer.parseInt(p.getData()[i], 2);
			andPiece[i] = Integer.toBinaryString(row);
			StringBuffer buf = new StringBuffer();
			for(int j = andPiece[i].length(); j < p.width; j++){
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
	public boolean isSuitable(Piece p){
		//自身とpのXOR演算結果を取得
		Piece xorPiece = getXORPiece(p);
		//自身とXOR演算結果のAND演算結果を取得
		Piece andPiece = getANDPiece(xorPiece);
		//上の演算結果と自身が等しければはまる
		for(int i = 0; i < p.height; i++){
			if(this.data[i].compareTo(andPiece.getData()[i]) != 0){
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuffer buf = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			buf.append(data[i].toString().replace(NOT_EXIST, '.')
					.replace(EXIST, '#'));
			buf.append("\n");
		}
		return buf.toString();
	}
}