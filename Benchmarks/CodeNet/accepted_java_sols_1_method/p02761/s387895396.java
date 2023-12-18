import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int s[] = new int[M];
		int c[] = new int[M];
		
		for(int i = 0; i < M; i++){
			s[i] = sc.nextInt() - 1;
			c[i] = sc.nextInt();
		}
		
		int digit[] = new int[N];
		Arrays.fill(digit, -1);
		
		boolean error = false;
		
		for(int i = 0; i < M; i++){
			if(digit[s[i]] == -1 || digit[s[i]] == c[i]){
				digit[s[i]] = c[i];
			}
			else error = true;
		}
		
		StringBuffer sb = new StringBuffer(""); 
		
		if(!error){
			
			if(digit[0] != -1)sb.append(digit[0]);
			else if(N != 1)sb.append(1);
			else sb.append(0);
			
			for(int i = 1; i < N; i++){
				if(digit[i] != -1)sb.append(digit[i]);
				else sb.append(0);
			}
			
			int len = String.valueOf(Integer.valueOf(sb.toString())).length();
			if(len < N)error = true;
		}
		
		System.out.println((error)?-1:sb.toString());
	}
}