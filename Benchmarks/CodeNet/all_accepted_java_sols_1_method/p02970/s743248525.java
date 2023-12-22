//package atcoder;

import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int N= sc.nextInt();	
			int D = sc.nextInt();
			
	
			int count = 1;
			int A = (2*D+1)*1;
		while(A<N) {
			count ++;
			A = (2*D+1)*count;
			
		}
		
		System.out.println(count);
	}		
}