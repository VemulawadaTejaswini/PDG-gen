import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int T = sc.nextInt();

		int c[] = new int[n];
		int t[] = new int[n];
		int min = 10000;

		for (int i = 0;i<n ;i++ ) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}

		for (int i = 0;i<n ;i++ ) {
			if (t[i]<=T) {
				 min = Math.min(min,c[i]);
			}
		}

		if (min == 10000) {
			System.out.println("TLE");
		}else{
			System.out.println(min);
		}

	}
}
