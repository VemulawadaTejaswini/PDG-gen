import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int x = sc.nextInt();
		int max = 1;
		for (int i = 2; i * i <= x; i++) {
			int t = i;
			while (t <= x) {
				t = t * i;
			}
			max = Math.max(max, t / i);
		}
		System.out.println(max);
	}
}
