import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int count=0;
		int x=10000000;
		int[] S = new int[x];
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int s=sc.nextInt();
			S[s]++;
		}
		int q=sc.nextInt();
		for(int i=0;i<q;i++){
			int t=sc.nextInt();
			if(S[t]<=1)
				S[t]++;
		}
		for(int i=0;i<x;i++){
			if(S[i]==2){
				count++;
			}
		}
		System.out.println(count);
	}

}