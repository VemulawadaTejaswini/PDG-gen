class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// コマンドライン引数から整数nを取り出す
		int deptWeek = Integer.parseInt(args[0]);

		// 変数宣言
		double dept = 100000; // 借金
		int ceilLength = 1000; // 切り上げ時の数値

		// n週分、借金に5%の利子を加算(1000円未満は切り上げとする)
		for (int i = 0; i < deptWeek; i++) {
			dept *= 1.05;
			dept = Math.ceil(dept / ceilLength) * ceilLength;

		}

		// 借金の残高を出力
		System.out.println(String.valueOf(dept));

	}
}