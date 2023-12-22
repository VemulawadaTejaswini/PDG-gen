import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[] = new int[n];
		for(int i = 0; i < n; ++i)h[i] = sc.nextInt();
		sc.close();
		int ans = 1;
		int max = h[0];
		for(int i = 1; i < n; ++i) {
			if(max <= h[i]) {
				max = h[i];
				++ans;
			}
		}
		System.out.println(ans);
	}

}
