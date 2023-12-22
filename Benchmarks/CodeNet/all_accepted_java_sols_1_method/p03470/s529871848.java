import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] d = new int[N];
		for (int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
		}
		
		Arrays.sort(d);
		
		int cnt = 0;
		int prev = 0;
		for (int i : d) {
			if (prev < i) {
				cnt++;
			}
			prev = i;
		}
		
		System.out.println(cnt);
	}
}
