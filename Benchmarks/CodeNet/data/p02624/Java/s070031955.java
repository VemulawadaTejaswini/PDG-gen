import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long ans = 0;
		int[] yn = new int[N+1];
		for(int i = 1; i <= N; i++)
			for(int k = 1; k <= N / i; k++)
				yn[i*k]++;
		for(int i = 1; i <= N; i++)
			ans += (long)i * yn[i];
		System.out.println(ans);
	}

}