import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = Math.abs(a-b);
		int e = Math.abs(b-c);
		int f = Math.abs(c-a);
		int g = d+e;
		int h = e+f;
		int i = f+d;
		int min = Math.min(g, h);
		min = Math.min(min, i);
		System.out.println(min);
	}
}
