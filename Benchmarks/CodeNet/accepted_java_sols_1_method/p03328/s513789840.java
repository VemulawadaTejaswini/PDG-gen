import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = 0, n;
		n = b - a;
		for (int i = 1; i < n; i++) {
			h = h + i;
		}
		System.out.println(h - a);
	}
}
