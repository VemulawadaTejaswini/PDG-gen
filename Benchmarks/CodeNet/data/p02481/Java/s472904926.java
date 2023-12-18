import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner input = new java.util.Scanner(System.in);
		int x, y, a, b;
		x = input.nextInt();
		y = input.nextInt();
		a = x * y;
		b = x * 2 + y * 2;
		System.out.printf("%d %d\n", a, b);
	}
}