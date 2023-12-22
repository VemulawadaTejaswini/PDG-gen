import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] l = new int[N];
		for(int i = 0;i < N;++i)
			l[i] = sc.nextInt();
		sc.close();
		
		int ans = 0;
		Arrays.sort(l);
		for(int i = 0;i < K;++i)
			ans += l[N-i-1];
		System.out.println(ans);
	}
}
