public class Main {
	public static void main(String[] ags) {
		for (int leftIdx = 1; leftIdx <= 9; leftIdx++) {
			for (int rightIdx = 1; rightIdx <= 9; rightIdx++) {
				System.out.println(leftIdx + "x" + rightIdx + "=" + (leftIdx * rightIdx));
			}
		}
	}
}