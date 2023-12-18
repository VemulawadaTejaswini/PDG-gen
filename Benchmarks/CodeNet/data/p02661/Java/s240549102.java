import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		long ans = 0;
		long[][] ranges = new long[N][2];
		long[] lower = new long[N];
		long[] upper = new long[N];
		for (int i = 0; i < N; i++) {
			long A = input.nextLong();
			long B = input.nextLong();
			ranges[i][0]=A;
			ranges[i][1]=B;
			lower[i]=A;
			upper[i]=B;
		}
		Arrays.sort(lower);
		Arrays.sort(upper);
		if (N%2==0) {
			int L = N/2-1;
			int R = N/2;
			long ways = upper[R]-upper[L]+1;
			ans = ways+lower[R]-1;
			ans=Math.max(0, ans);
		}else {
			int index = N/2;
			ans=upper[index]-lower[index]+1;
			ans=Math.max(0, ans);
		}
		System.out.println(ans);
	}	
}