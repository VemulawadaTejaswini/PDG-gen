import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		int[] p = new int[N];
		for(int i=0; i<N; i++)
			p[i] = sc.nextInt();
		Arrays.sort(p);
		int ans = X;
		for(int i=0; i<100; i++) {
			int v = X-i;
			if(Arrays.binarySearch(p, v)<0) {
				ans = v;
				break;
			}
			v = X+i;
			if(Arrays.binarySearch(p, v)<0) {
				ans = v;
				break;
			}
		}

		System.out.println(ans);
		sc.close();
	}
}
