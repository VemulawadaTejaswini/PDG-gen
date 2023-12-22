import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N*2];
		for(int i=0; i<N*2; i++)
			L[i] = sc.nextInt();
		
		Arrays.sort(L);
		int ans = 0;
		for(int i=0; i<N; i++)
			ans += L[i*2];
		
		System.out.println(ans);
		
		sc.close();
	}
}
