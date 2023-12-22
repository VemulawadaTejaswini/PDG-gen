import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long a = 0, b = 0, c = 0;
		a = x / 500; b = (x - a * 500) / 5; c = ( a * 1000 + b * 5);
		System.out.println(c);
	}
}
