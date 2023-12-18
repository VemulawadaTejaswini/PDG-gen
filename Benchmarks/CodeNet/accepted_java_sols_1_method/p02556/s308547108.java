import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long[] XplusY = new long[N];
		long[] XminusY = new long[N];
		for(int i=0; i<N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			XplusY[i] = (long)x + y;
			XminusY[i] = (long)x - y;
		}
		
		Arrays.sort(XplusY);
		Arrays.sort(XminusY);
		
		System.out.println(Math.max(XplusY[N-1]-XplusY[0], XminusY[N-1]-XminusY[0]));
		
		sc.close();
	}
}

