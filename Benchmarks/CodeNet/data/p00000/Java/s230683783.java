public class Q0000 {

	public static void main(String[] args) {
		/*
		1x1=1
		1x2=2
		.
		.
		9x8=72
		9x9=81
		*/
		for (int i = 1; i < 10; i++) {
			for (int n = 1; n < 10; n++) {
				System.out.println(i + "x" + n + "=" + (i * n));
			}
		}
		
	}
}