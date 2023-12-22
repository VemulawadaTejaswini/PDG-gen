import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a %2 == 1 || b %2 == 1 || c %2 == 1) {
			System.out.println(0);
		} else if (a == b && b == c) {
			System.out.println(-1);
		} else {
			int count = 0;
			while (a%2 == 0 && b%2 == 0 && c%2 == 0) {
				count++;
				int x = (b+c)/2;
				int y = (a+c)/2;
				int z = (a+b)/2;
				a = x;
				b = y;
				c = z;
			}
			System.out.println(count);
		}
		sc.close();
	}

}
