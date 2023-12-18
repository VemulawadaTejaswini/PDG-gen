
public class Main {

	private int[][] cells;

	public Main() {
		// 10×10 マス領域を用意
		this.cells = new int[10][10];
	}

	public static void main(String[] args) throws Exception {
		// 入力を行ごとに分割する

		Main droppingInk = new Main();
		// 行数分、配列へ格納する
		for (String inks : args) {

			// 1回落下分のインク情報
			String[] ink = inks.split(",");
			// インクのx座標
			int ink_X = Integer.parseInt(ink[0]);
			// インクのy座標
			int ink_Y = Integer.parseInt(ink[1]);
			// インクの大きさ
			int ink_size = Integer.parseInt(ink[2]);

			// インキ滴が落したマスに値を加算する
			droppingInk.carcDroppingInk(ink_X, ink_Y, ink_size);
		}

		// 結果を出力する
		droppingInk.print();

	}

	/**
	 * 方眼紙にインクを滴下する。
	 *
	 * @param ink_X
	 *            インクが滴下されるx位置
	 * @param ink_Y
	 *            インクが滴下されるy位置
	 * @param size
	 *            インクの大きさ
	 */
	private void carcDroppingInk(int ink_X, int ink_Y, int size) {
		switch (size) {
		case 3:
			this.cells[ink_X - 2][ink_Y] += isRangeAdd(ink_X - 2, ink_Y);
			this.cells[ink_X][ink_Y - 2] += isRangeAdd(ink_X, ink_Y - 2);
			this.cells[ink_X + 2][ink_Y] += isRangeAdd(ink_X + 2, ink_Y);
			this.cells[ink_X][ink_Y + 2] += isRangeAdd(ink_X, ink_Y + 2);

		case 2:
			this.cells[ink_X - 1][ink_Y - 1] += isRangeAdd(ink_X - 1, ink_Y - 1);
			this.cells[ink_X - 1][ink_Y + 1] += isRangeAdd(ink_X - 1, ink_Y + 1);
			this.cells[ink_X + 1][ink_Y - 1] += isRangeAdd(ink_X + 1, ink_Y - 1);
			this.cells[ink_X + 1][ink_Y + 1] += isRangeAdd(ink_X + 1, ink_Y + 1);

		case 1:
			this.cells[ink_X][ink_Y] += isRangeAdd(ink_X, ink_Y);
			this.cells[ink_X - 1][ink_Y] += isRangeAdd(ink_X - 1, ink_Y);
			this.cells[ink_X][ink_Y - 1] += isRangeAdd(ink_X, ink_Y - 1);
			this.cells[ink_X + 1][ink_Y] += isRangeAdd(ink_X + 1, ink_Y);
			this.cells[ink_X][ink_Y + 1] += isRangeAdd(ink_X, ink_Y + 1);
		}
	}

	/**
	 * インクの滴下先が方眼紙の範囲内か判定する。 範囲内の場合、滴下結果である１を返却。範囲外の場合は０を返却。
	 *
	 * @param cells_X
	 * @param cells_y
	 * @return 滴下結果
	 */
	private int isRangeAdd(int cells_X, int cells_y) {
		if ((0 <= cells_X && cells_X < 10) & (0 <= cells_y && cells_y < 10)) {
			// インクの滴下先が方眼紙の範囲内の場合、１をセルに追加
			return 1;
		} else {
			// インクの滴下先が方眼紙の範囲外の場合何もしない
			return 0;
		}
	}

	/**
	 * 色のついていない部分のマス目の個数、１番濃いマス目の濃さを出力する。
	 */
	private void print() {
		int countZero = 0;
		int maxInk = 0;

		for (int[] cells_x : this.cells) {
			for (int cell_xy : cells_x) {
				// 色のついていない部分のマス目の個数を計算
				if (cell_xy == 0) {
					countZero++;
				}
				// １番濃いマス目の濃さを計算
				if (maxInk < cells_x[cell_xy]) {
					maxInk = cells_x[cell_xy];
				}
			}
		}

		// 出力
		System.out.println(countZero);
		System.out.println(maxInk);

	}
}