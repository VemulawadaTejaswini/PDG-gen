import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[10001];
		s[0] = 1;
		for (int i = 1; i < 10000; i++)
			s[i] = s[i - 1] + i;
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			System.out.println(s[n]);
		}
	}
}