import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N*3];
		for(int i=0; i<N*3; i++)
			a[i] = sc.nextInt();
		
		Arrays.sort(a);
		long ans = 0;
		
		for(int i=0; i<N; i++)
			ans += a[N*3-(i+1)*2];
		
		System.out.println(ans);
		sc.close();
	}
}
