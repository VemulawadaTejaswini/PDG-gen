import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int d[] = new int[N];
		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		if (d[N/2-1] == d[N/2]) {
			System.out.println(0);
		} else {
			System.out.println(d[N/2] - d[N/2-1]);
		}
	}
}
