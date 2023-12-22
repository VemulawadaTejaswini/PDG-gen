import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;
 
 
 
public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int N = s.length();
		int[] child = new int[N];
		Arrays.fill(child, 0);
		
		int[] R = new int[N];
		Arrays.fill(R, 1);
		int[] L = new int[N];
		Arrays.fill(L, 1);
		
		for(int i = 0; i < N - 2; i++) {
			if(s.charAt(i)=='R') {
				if(s.charAt(i + 1) == 'R') {
					if(s.charAt(i + 2) == 'R') {
						R[i + 2] += R[i];
						R[i] = 0;
					}
					else {
						child[i + 2] += R[i];
					}
				}
				else {
					child[i] += R[i];
				}
			}
			else {
				R[i] = 0;
			}
		}
		if(s.charAt(N - 2) == 'L') {
			R[N - 2] = 0;
		}
		else {
			child[N - 2] += R[N - 2];
		}
		
		for(int i = N - 1; i > 1; i--) {
			if(s.charAt(i)=='L') {
				if(s.charAt(i - 1) == 'L') {
					if(s.charAt(i - 2) == 'L') {
						L[i - 2] += L[i];
						L[i] = 0;
					}
					else {
						child[i - 2] += L[i];
					}
				}
				else {
					child[i] += L[i];
				}
			}
			else {
				L[i] = 0;
			}
		}
		if(s.charAt(1) == 'R')L[1] = 0;
		else {
			child[1] += L[1];
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(child[i]+((i != N-1)?" ":""));
		}
		
	 }
}