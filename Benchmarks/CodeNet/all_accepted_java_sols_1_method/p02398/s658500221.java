import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		int count = 0;
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		if (a > b) {
			throw new RuntimeException("error:You must write a<=b");
		}
		if (a < 1 || 10000 < a || b < 1 || 10000 < b || c < 1 || 10000 < c) {
			throw new RuntimeException("error:You must write 1<=a,b,c<=10000");
		}
		for (int i = a; i <= b; i += 1) {
			if (c % i == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}