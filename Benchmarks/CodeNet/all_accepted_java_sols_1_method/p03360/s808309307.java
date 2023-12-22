import java.util.*;

class Main{
	public static void main(String args[]) throws Exception{
		Scanner sc = new Scanner(System.in);
		long a[] = new long[3];
		for(int i = 0; i < 3; i++) a[i] = sc.nextLong();
		int K = sc.nextInt();
		Arrays.sort(a);
		for(int i = 1; i <= K; i++) a[2] *= 2;
		long ans = 0;
		for(int i = 0; i < 3; i++) ans += a[i];
		System.out.println(ans);
	}
}