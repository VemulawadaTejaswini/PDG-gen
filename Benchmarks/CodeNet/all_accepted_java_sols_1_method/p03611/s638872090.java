import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[100003];
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			x[a]++;
			x[a+1]++;
			x[a+2]++;
		}
		int ans = x[0];
		for(int i = 1; i < 100003; i++)
			ans = Math.max(ans, x[i]);
		System.out.println(ans);
	}

}