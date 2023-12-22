import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt(), d[] = new int[n + 1];
		for(int i = 0; i < n; ++i) 
			d[i] = sc.nextInt();
		sc.close();
		d[n] = 1000;
		Arrays.sort(d);
		int ans = 0;
		for(int i = 0; i < n; ++i) {
			if(d[i] != d[i + 1])++ans;
		}
		System.out.println(ans);
	}

}
