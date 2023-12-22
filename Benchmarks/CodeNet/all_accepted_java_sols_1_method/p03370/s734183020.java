import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] m = new int[N];
		for(int i = 0;i < N;++i)
			m[i] = sc.nextInt();
		sc.close();
		
		int res = X;
		int ans = N;
		Arrays.sort(m);
		for(int i = 0;i < N;++i)
			res -= m[i];
		ans += res / m[0];
		System.out.println(ans);
	}
}
