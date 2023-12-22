import java.util.*;
import java.io.*;
 
public class Main{
    
	public static void main(String[] $){
		Scanner sc = new Scanner(System.in);
		int D = sc.nextInt();
		int[] c = new int[26];
		for(int i = 0; i < 26; i++){
			c[i] = sc.nextInt();
		}
		int[][] s = new int[D][26];
		for(int i = 0; i < D; i++){
			for(int j = 0; j < 26; j++){
				s[i][j] = sc.nextInt();
			}
		}
		int[] last = new int[26];
		long satisfact = 0;
		
		for(int i = 0; i < D; i++){
			long max = Integer.MIN_VALUE;
			int sentaku = -1;
			for(int j = 0; j < 26; j++){
				if(max < s[i][j]){
					max = s[i][j];
					sentaku = j;
				}
			}
			satisfact = satisfact + max;
			last[sentaku] = i+1;
			for(int j = 0; j < 26; j++){
				satisfact -= c[j]*((i+1)-last[j]);
			}
			System.out.println(sentaku+1);
		}
	}
} 