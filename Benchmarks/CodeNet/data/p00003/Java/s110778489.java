import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] l = new int[3];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < 3; ++j) {
				l[j] = sc.nextInt();
			}
			Arrays.sort(l);
			System.out.println(l[0] * l[0] + l[1] * l[1] == l[2] * l[2] ? "YES" : "NO");
		}
		sc.close();
	}
}
