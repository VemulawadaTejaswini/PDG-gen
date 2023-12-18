import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
	static int N;
	static int[] S, T;
			
	static private void solve()
	{
		int[] train = new int[24*60*60];
		
		for (int i = 0; i < 24*60*60; i++) train[i] = 0;
		for (int i = 0; i < N; i++) {
			train[S[i]]++;
			train[T[i]]--;
		}
		for (int i = 1; i < 24*60*60; i++) train[i] += train[i-1];
		
		int max = 0;
		for (int i = 0; i < 24*60*60; i++)
		{
			max = Math.max(max, train[i]);
		}
		
		System.out.println(max);
	}
	
	static public void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			N = sca.nextInt();
			if(N == 0) break;
			
			S = new int[N];
			T = new int[N];
			for (int i = 0; i < N; i++) {
				String str;
				int h, m, s;
				
				str = sca.next();
				h = (str.charAt(0) - '0') * 10 + (str.charAt(1) - '0');
				m = (str.charAt(3) - '0') * 10 + (str.charAt(4) - '0');
				s = (str.charAt(6) - '0') * 10 + (str.charAt(7) - '0');
				S[i] = h * 60 * 60 + m * 60 + s;
				
				str = sca.next();
				h = (str.charAt(0) - '0') * 10 + (str.charAt(1) - '0');
				m = (str.charAt(3) - '0') * 10 + (str.charAt(4) - '0');
				s = (str.charAt(6) - '0') * 10 + (str.charAt(7) - '0');
				T[i] = h * 60 * 60 + m * 60 + s;
			}
			
			solve();
		}
	}
}