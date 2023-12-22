import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int c = a;
		int d = a;
		int[] b = new int[10];
		int i = 0;
		while (a != 0) {
			b[i] = a % 10;
			a = c / 10;
			c = a;
			i = i + 1;
		}
		int n = 0;
		for (int j = 0; j < 10; j++) {
			n = n + b[j];
		}
		String e = (d % n == 0) ? "Yes" : "No";
		System.out.println(e);
	}
}