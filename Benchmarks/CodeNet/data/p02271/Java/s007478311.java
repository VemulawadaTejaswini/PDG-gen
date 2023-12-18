

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		int m=scan.nextInt();
		for(int i=0;i<m;i++){
			int tmp=scan.nextInt();
			if(solve(0,tmp,arr))
				System.out.println("yes");
			else System.out.println("no");
			
		}
	}

	private static boolean solve(int i, int n,int[] arr) {
		// TODO Auto-generated method stub
		if(n==0)
			return true;
		if(i>=arr.length)
			return false;
		return solve(i+1, n,arr)||solve(i+1, n-arr[i],arr);
	}

}

