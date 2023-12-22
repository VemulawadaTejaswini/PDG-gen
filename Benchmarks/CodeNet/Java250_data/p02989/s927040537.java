import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] d = new int[N];
		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		int f = d.length / 2 - 1;
		int s = f + 1;
		System.out.println(d[s] - d[f]);
		sc.close();
	}
}
