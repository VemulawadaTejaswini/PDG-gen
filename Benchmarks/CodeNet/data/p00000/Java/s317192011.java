public class Main {

	static final int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		for (int i : nums) {
			for (int j : nums) {
				sb.append(String.format("%dx%d=%d\n", i, j, i * j));
			}
		}
		System.out.print(sb.toString());
	}
}