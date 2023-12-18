import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int x = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int t;
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			x = x - t;
			min = Math.min(min, t);
		}
		System.out.println(x / min + n);
	}
}
