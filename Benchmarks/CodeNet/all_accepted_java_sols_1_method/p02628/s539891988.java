import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int ans = 0;
		int[] p = new int[N];
		Arrays.setAll(p, i -> sc.nextInt());
		Arrays.sort(p);
		for(int i = 0; i < K; i++)
			ans += p[i];
		System.out.println(ans);
	}

}