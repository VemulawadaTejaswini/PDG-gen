import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int swap;
		if (a > b) {swap = a; a = b; b = swap;}
		if (a > c) {swap = a; a = c; c = swap;}
		if (b > c) {swap = b; b = c; c = swap;}
		System.out.printf("%d %d %d\n", a, b, c);
	}
}