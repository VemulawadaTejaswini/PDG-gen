import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();
		int a = 0;

		if (x == 0 && y == 100) a = 101;
		else if (x == 1 && y == 100) a = 10100;
		else if (x == 2 && y == 100) a = 1010000;
		else a = (int)Math.pow(100,  x) * y;
		System.out.println(a);
	}
}