import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] x = {a, b, c};
		Arrays.sort(x);
		int ans = 0;
		if(x[0] == x[1] && x[1] == x[2]) {
			System.out.println(0);
			return;
		}
		while(x[2] > x[1]) {
			x[1]++;
			x[0]++;
			ans++;
		}
		while(x[1] > x[0]) {
			x[0] += 2;
			ans++;
		}
		if(x[0] == x[1]) {
			System.out.println(ans);
		} else {
			System.out.println(ans + 1);
		}
	}
}
