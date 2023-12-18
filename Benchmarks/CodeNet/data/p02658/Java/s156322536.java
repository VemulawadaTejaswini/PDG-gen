import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 

	public static void main(String[] args) { //
		Scanner input = new Scanner(System.in);
		long limit = (long)(1e18);
		System.out.println(limit);
		long ans = 1;
		int N = input.nextInt();
		boolean ZERO = false;
		long[] arr = new long[N];
		for (int i = 0; i < N; i++) {
			long x = input.nextLong();
			arr[i]=x;
			ans*=x;
			if (ans>limit) {
				ans=-1;
			}
		}
		for (int i = 0; i < N; i++) {
			if (arr[i]==0) {
				ZERO=true;
				break;
			}
		}
		System.out.println(ZERO?0:ans);
	}	
}