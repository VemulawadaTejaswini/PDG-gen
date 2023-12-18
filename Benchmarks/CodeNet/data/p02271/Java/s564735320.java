

import java.util.Scanner;

public class Main {
	
	public static int n;
	public static int[] A = new int[50];
	
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		A = new int[n];
		for(int i = 0;i<n;i++){
			A[i] = in.nextInt();
		}
		int q = in.nextInt();
		int[] m = new int[q];
		for(int j=0;j<q;j++){
			m[j] = in.nextInt();
			if(solve(0, m[j]))
				System.out.println("yes");
			else 
				System.out.println("no");
		}
	}
	public static boolean solve(int i,int m){
		if(m==0) return true;
		if(i>=n) return false;
		
		boolean res = solve(i+1,m)||solve(i+1,m-A[i]);
		return res;
	}
}

