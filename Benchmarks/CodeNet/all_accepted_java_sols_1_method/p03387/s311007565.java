import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int ans = 0;
		int[] d = {a, b, c};
		Arrays.sort(d);
		while(d[2] - 1 > d[1]) {
			ans++;
			d[1] += 2;
		}
		while(d[2] - 1 > d[0]) {
			ans++;
			d[0] += 2;
		}
		if(d[2] == d[1] && d[2] == d[0]) {
			System.out.println(ans);
		} else if(d[1] == d[0] && d[1] != d[2]) {
			System.out.println(ans + 1);
		} else {
			System.out.println(ans + 2);
		}
	}
}
