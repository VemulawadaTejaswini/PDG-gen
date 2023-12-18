import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int top = -1;
		int max = -1;
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			int v = in.nextInt();
			if (v > max || v == max && top > a) {
				top = a;
				max = v;
			}
		}
		System.out.print(top);
		System.out.print(' ');
		System.out.println(max);
		in.close();
	}
}