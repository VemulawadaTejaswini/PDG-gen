import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner ipt = new Scanner(System.in);
		int a = ipt.nextInt(), b = ipt.nextInt(), c = 0;
		c = b - a + 1;
		for (int i = (a * 2) - 1; i > 0; i--) {
			System.out.print(c + " ");
			c++;
		}
		ipt.close();
	}
}