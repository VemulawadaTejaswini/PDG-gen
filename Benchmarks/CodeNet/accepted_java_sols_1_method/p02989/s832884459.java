
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		for(int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		int ans = d[n/2] - d[n/2 - 1];
		System.out.println(ans);
		sc.close();
	}
}
