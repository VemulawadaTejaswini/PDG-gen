import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] as = new int[n];
		int[] bs = new int[n];
		for(int i=0; i<n; i++) {
			as[i] = sc.nextInt();
			bs[i] = sc.nextInt();
		}
		Arrays.sort(as);
		Arrays.sort(bs);
		if(n%2 != 0) {
			int i = n/2;
			int ans = bs[i] - as[i] + 1;
			System.out.println(ans);
		} else {
			int i = n/2;
			int ans = (bs[i-1]+bs[i]) - (as[i-1]+as[i]) + 1;
			System.out.println(ans);
		}
	}
}
