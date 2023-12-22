import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] L = new int[N+1];
		int[] d = new int[N+1];
        d[0] = 0;
		for (int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
		}
        int ans = 1;
		for (int i = 1; i < N+1; i++) {
            d[i] = d[i-1]+L[i-1];
			if(d[i]<=X){
              ans++;
            }
		}
		System.out.println(ans);
	}		
}
