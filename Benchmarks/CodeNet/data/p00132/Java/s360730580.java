import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	private	static	Scanner	m_stdin             = null;
	private			Board	m_board             = null;
	private			Puzzle	m_puzzle[]          = null;
	private			int		m_arrPieceLists[][] = null;

	static {
		m_stdin = new Scanner(System.in);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main	main = new Main();
		while(true) {
			main.initBoard();
			if (main.isEnd()) {
				break;
			}
			main.initPiece();
			main.initPieceLists();
			main.mainProc();
		}
	}

    public void initBoard() {
    	m_board = createBoard();
	}

    public void initPiece() {
		// ピースの数を取得する
		int		nPieceMax = m_stdin.nextInt();
		Board	cTmpBoard = null;

		// ピースのデータを取得する
		{
			m_puzzle = new Puzzle[nPieceMax];
			for (int nPiece = 0; nPiece < nPieceMax; nPiece++) {
				m_puzzle[nPiece] = new Puzzle();

				// 回転角度0のピース
				cTmpBoard = createBoard();
				m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_0] = cTmpBoard;

				// 回転角度90のピース
				cTmpBoard = cTmpBoard.rot();
				if (m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_0].isEqual(0, 0, cTmpBoard)) {
					// 回転角度0のピースと同じならこれ以上追加しない
					continue;
				}
				m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_90] = cTmpBoard;

				// 回転角度180のピース
				cTmpBoard = cTmpBoard.rot();
				if (m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_0].isEqual(0, 0, cTmpBoard)) {
					// 回転角度0のピースと同じならこれ以上追加しない
					continue;
				}
				m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_180] = cTmpBoard;

				// 回転角度270のピース
				cTmpBoard = cTmpBoard.rot();
				m_puzzle[nPiece].m_cPuzzles[Puzzle.ROTATE_ANGLE_270] = cTmpBoard;
			}
		}
	}

    private Board createBoard() {
		int		nHeigth = m_stdin.nextInt();
		int		nWidth  = m_stdin.nextInt();
    	Board	board   = new Board(nHeigth, nWidth);

		// 盤面のデータを取得する
		for (int nLine = 0; nLine < nHeigth; nLine++) {
			board.setLine(nLine, m_stdin.next());
		}

		return board;
    }

    public void initPieceLists() {
		// ピースリストの数を取得する
		String	szPieceListsMax = m_stdin.next();
		int 	nPieceListsMax  = Integer.parseInt(szPieceListsMax);

		// ピースのデータを取得する
		{
			m_arrPieceLists  = new int[nPieceListsMax][];
			for (int nPieceListsIndex = 0; nPieceListsIndex < nPieceListsMax; nPieceListsIndex++) {
				m_arrPieceLists[nPieceListsIndex] = createPieceList();
			}
		}
    }

    private int[] createPieceList() {
    	int		arrPieceList[] = null;

		// 盤面のリストの要素数を取得する
		{
			String	szPieceNum = m_stdin.next();
			int		nPieceNum  = Integer.parseInt(szPieceNum);

			if (nPieceNum > 0) {
				arrPieceList = new int[nPieceNum];
				for (int nLoop = 0; nLoop < nPieceNum; nLoop++) {
					String	szPieceNo   = m_stdin.next();
					arrPieceList[nLoop] = Integer.parseInt(szPieceNo);
				}
			}
		}

		return arrPieceList;
    }

	public void mainProc() {
		Puzzle	puzzle    = null;
		Board   piece     = null;
		int		nIndexMax = m_puzzle.length;
		int		nWidth    = m_board.getWidth();
		int		nHeight   = m_board.getWidth();
		int		nListsMax = m_arrPieceLists.length;

		// 初期状態で各ピースを置けるパターンをチェック
		for(int nIndex = 0; nIndex < nIndexMax; nIndex++) {
			for(int nAngle = Puzzle.ROTATE_ANGLE_0; nAngle <= Puzzle.ROTATE_ANGLE_270; nAngle++) {
				puzzle = m_puzzle[nIndex];
				piece  = puzzle.m_cPuzzles[nAngle];

				if (piece != null) {
					for(int nY = 0; nY < nHeight; nY++) {
						for(int nX = 0; nX < nWidth; nX++) {
							if (check(nX, nY, piece)) {
								int pos[] = { nX, nY, nAngle };
								puzzle.m_cPoslist.add(pos);
							}
						}
					}
				}
			}
		}

		for (int nLists = 0; nLists < nListsMax; nLists++) {
/*			if (isSolve(nLists)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}*/
		}
	}

	public boolean isEnd() {
		boolean	bEnd = false;

		if (m_board == null) {
			bEnd = true;
		} else if (m_board.getHeight() == 0 || m_board.getWidth() == 0) {
			bEnd = true;
		}

		return bEnd;
	}

	public boolean check(int nCX, int nCY, Board cBoard) {
		boolean	bEnable = false;
	
		if (cBoard != null) {
			if (0 <= nCY && nCY + cBoard.getHeight() <= m_board.m_nHeight) {
				if (0 <= nCX && nCX + cBoard.getWidth() <= m_board.m_nWidth) {
					int	nHeight = cBoard.getHeight();
	
					bEnable = true;
					for (int nY = 0; nY < nHeight && bEnable; nY++) {
						int	nPBit = cBoard.getLine(nY) << nCX;
						int	nBBit = m_board.getLine(nCY + nY) & m_board.m_nFullBit;

						if ((~nBBit & nPBit) != nPBit) {
							bEnable = false;
						}
					}
				}
			}
		}
	
		return bEnable;
	}

	public boolean isSolve(int nListsIndex) {
		boolean	bSolve = false;

		if (m_board != null && m_puzzle != null && m_arrPieceLists != null) {
			Puzzle	puzzle         = null;
			Board   piece          = null;
			int		arrPieceList[] = m_arrPieceLists[nListsIndex];
			int		nListMax       = arrPieceList.length;
			int		nListIndex     = 0;
			int		nPosList[]     = new int[nListMax];
			int		nPosInfo[]     = null;

			while (0 <= nListIndex && nListIndex < nListMax) {
				boolean	bNext = false;

				puzzle = m_puzzle[arrPieceList[nListIndex] - 1];
				for (;nPosList[nListIndex] < puzzle.m_cPoslist.size(); nPosList[nListIndex]++) {
					nPosInfo = puzzle.m_cPoslist.get(nPosList[nListIndex]);
					piece = puzzle.m_cPuzzles[nPosInfo[2]];
					if (check(nPosInfo[0], nPosInfo[1], piece)) {
						m_board.put(nPosInfo[0], nPosInfo[1], piece);
						bNext = true;
						break;
					}
				}

				if (bNext) {
					nListIndex++;
					if (nListIndex < nListMax) {
						nPosList[nListIndex] = 0;
						if (m_board.isFull()) {
							break;
						}
					}
				} else {
					nListIndex--;
					if (0 <= nListIndex) {
						puzzle   = m_puzzle[arrPieceList[nListIndex] - 1];
						nPosInfo = puzzle.m_cPoslist.get(nPosList[nListIndex]);
						piece = puzzle.m_cPuzzles[nPosInfo[2]];
						m_board.remove(nPosInfo[0], nPosInfo[1], piece);
						nPosList[nListIndex]++;
					}
				}
			}

			if (nListIndex == nListMax && m_board.isFull()) {
				bSolve = true;
			}

			for(int nRmIndex = 0; nRmIndex < nListIndex; nRmIndex++) {
				puzzle   = m_puzzle[arrPieceList[nRmIndex] - 1];
				nPosInfo = puzzle.m_cPoslist.get(nPosList[nRmIndex]);
				piece = puzzle.m_cPuzzles[nPosInfo[2]];
				m_board.remove(nPosInfo[0], nPosInfo[1], piece);
			}
		}

		return bSolve;
	}

	public class Puzzle {
		// マッチング用の盤面の回転角度
		public	static	final	int					ROTATE_ANGLE_0   = 0;		// 0度
		public	static	final	int					ROTATE_ANGLE_90  = 1;		// 90度
		public	static	final	int					ROTATE_ANGLE_180 = 2;		// 180度
		public	static	final	int					ROTATE_ANGLE_270 = 3;		// 270度

		// 外部からアクセス可能な変数
		public					ArrayList<int[]>	m_cPoslist       = null;	// ボードをセットできる位置
		public					Board				m_cPuzzles[]     = null;	// 角度別のパズル

		public Puzzle() {
			m_cPoslist = new ArrayList<int[]>();
			m_cPuzzles = new Board[4];
		}
	}

	public class Board {
		// 内部変数
		private	int[]				m_arrBoard = null;	// 盤面
		private int					m_nFullBit = 0;		// 埋まった盤面
		private	int					m_nHeight  = 0;		// 盤面の幅
		private	int					m_nWidth   = 0;		// 盤面の高さ

		public Board() {}
		
		public Board(int nHeight, int nWidth) {
			setHeight(nHeight);
			setWidth(nWidth);
		}

		public void setHeight(int nHeight) {
			this.m_nHeight  = nHeight;
			this.m_arrBoard = new int[this.m_nHeight];
		}

		public int getHeight() {
			return this.m_nHeight;
		}

		public void setWidth(int Width) {
			this.m_nWidth   = Width;
			this.m_nFullBit = (int)(Math.pow(2.0, (double)Width) - 1.0);
		}

		public int getWidth() {
			return this.m_nWidth;
		}

		public void setLine(int nLine, String szLine) {
			if (0 <= nLine && nLine < this.m_nHeight) {
				int nBit = 0;

				for (char c : szLine.toCharArray()) {
					nBit <<= 1;
					nBit |= (c == '#') ? 1 : 0;
				}

				this.m_arrBoard[nLine] = nBit;
			}
		}

		public void setLine(int nLine, int nBit) {
			if (0 <= nLine && nLine < this.m_nHeight) {
				this.m_arrBoard[nLine] = nBit;
			}
		}

		public int getLine(int nLine) {
			int nBit = 0;

			if (0 <= nLine && nLine < this.m_nHeight) {
				nBit = this.m_arrBoard[nLine];
			}

			return nBit;
		}

		public boolean isFull() {
			boolean	bEnable = true;

			for (int nH = 0; nH < this.m_nHeight; nH++) {
				if (this.m_arrBoard[nH] != this.m_nFullBit) {
					bEnable = false;
					break;
				}
			}

			return bEnable;
		}

		public boolean isEqual(int nCX, int nCY, Board cBoard) {
			boolean	bEnable = false;
		
			if (cBoard != null) {
				if (0 <= nCY && nCY + cBoard.getHeight() <= this.m_nHeight) {
					if (0 <= nCX && nCX + cBoard.getWidth() <= this.m_nWidth) {
						int	nHeight = cBoard.getHeight();
		
						bEnable = true;
						for (int nY = 0; nY < nHeight && bEnable; nY++) {
							int	nPBit = cBoard.getLine(nY) << nCX;
							int	nBBit = getLine(nCY + nY) & this.m_nFullBit;

							if (nBBit != nPBit) {
								bEnable = false;
							}
						}
					}
				}
			}
		
			return bEnable;
		}

		public void put(int nCX, int nCY, Board cBoard) {
			if (cBoard != null) {
				int	nBHeight = cBoard.getHeight();
				
				for (int nY = 0; nY < nBHeight; nY++) {
					int	nBBit = cBoard.getLine(nY) << nCX;
					int	nMBit = getLine(nCY + nY);

					setLine(nCY + nY, nMBit | nBBit);
				}
			}
		}

		public void remove(int nCX, int nCY, Board cBoard) {
			if (cBoard != null) {
				int	nBHeight = cBoard.getHeight();
				
				for (int nY = 0; nY < nBHeight; nY++) {
					int	nBBit = cBoard.getLine(nY) << nCX;
					int	nMBit = getLine(nCY + nY);

					setLine(nCY + nY, nMBit & ~nBBit);
				}
			}
		}

		public Board rot() {
			Board	board = new Board(this.m_nWidth, this.m_nHeight);

			for (int nX = 0; nX < this.m_nWidth; nX++) {
				int	nBit  = 0;

				for (int nY = 0; nY < this.m_nHeight; nY++) {
					int nMask = (int)Math.pow(2.0, (int)nX);
					nBit <<= 1;
					if ((getLine(nY) & nMask) == nMask) {
						nBit |= 1;
					}
				}

				board.setLine(nX, nBit);
			}

			return board;
		}
	}
}