import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int N = sc.nextInt();
		
		int[] d = new int[N];
		int ans = 0;
		int avg = 0;
		for (int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
		}
		Arrays.sort(d);
		System.out.println(d[N/2] - d[(N/2)-1]);
//		int center = (d[(N/2)-1]+d[N/2])/2;
	}		
}
