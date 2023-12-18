public class Main {
	public static void main(String[] args) {
		for(int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				System.out.println(String.format("%dx%d=%d", a, b, a*b));
			}
		}
	}
}