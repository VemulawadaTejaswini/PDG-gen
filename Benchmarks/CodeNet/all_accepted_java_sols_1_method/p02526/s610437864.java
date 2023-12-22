import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int count=0;
		int x=10000000;
		int[] S = new int[x];
		for(int i=0;i<x;i++){
			S[i]=0;
		}
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int s=sc.nextInt();
			S[s]=1;
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int t=sc.nextInt();
			if(S[t]==1){	
				count++;
			}
		}
		
		System.out.println(count);
	}

}