class Main {

	/**
	 * 九九を出力する。
	 *
	 * @param a
	 *            利用しない。
	 */
	public static void main(String[] a) {

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}

	}
}