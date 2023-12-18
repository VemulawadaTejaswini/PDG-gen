public class Main {

	/**
	 * AOJ:QQ
	 * @param args
	 */

	static final String MULTIPLE = "x";
	static final String EQUAL = "=";

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + MULTIPLE + j + EQUAL + i * j);
			}
		}
	}

}