import java.io.*;
import java.math.*;
import java.util.*;
public class Main { 
 
	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		long mod = (long)(1e9+7);
		int N = input.nextInt();
		long K = input.nextLong();
		long ans = 0;
		long choose2Right = K*(K+1)/2; //Sum of first N numbers is N*(N+1)/2;
		//For K concatenations, sum of 1 through K pairs exist
		K--;
		long choose2Left = K*(K+1)/2;
		choose2Right%=mod;
		choose2Left%=mod;
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
		}
		for (int cur = 0; cur < N; cur++) {
			int curNum = arr[cur];
			long left = 0;
			long right = 0;
			for (int L = 0; L < cur; L++) {
				if (curNum>arr[L]) left++;
			}
			for (int R = cur+1; R < N; R++) {
				if (curNum>arr[R]) right++;
			}
			long curAns = right*choose2Right;
			curAns%=mod;
			curAns+=left*choose2Left;
			curAns%=mod;
			ans+=curAns;
			ans%=mod;
		}
		System.out.println(ans);
	}
}