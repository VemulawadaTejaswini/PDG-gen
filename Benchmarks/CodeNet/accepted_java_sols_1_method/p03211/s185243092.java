import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String s = sc.next();
		int min = Integer.MAX_VALUE;
		int num = 753, t;
		for (int i = 0; i < s.length() - 2; i++) {
			t = Integer.parseInt(s.substring(i, i + 3));
			min = Math.min(min, Math.abs(num - t));
		}
		System.out.println(min);
	}
}
