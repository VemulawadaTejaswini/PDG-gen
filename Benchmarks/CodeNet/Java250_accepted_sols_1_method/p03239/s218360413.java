import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] c = new int[N];
		int[] t = new int[N];
		for(int i = 0; i < N; i++) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}
		int ans = 2000000000;
		for(int i = 0; i < N; i++) {
			if(t[i] <= T) {
				if(c[i] < ans) {
					ans = c[i];
				}
			}
		}
		if(ans == 2000000000) {
			System.out.println("TLE");
		}else{
			System.out.println(ans);
		}
	}

}
