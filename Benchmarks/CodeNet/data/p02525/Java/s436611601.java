import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			int[] score=new int[n];
			for(int i=0;i<n;i++){
				score[i]=sc.nextInt();
			}

			double ave=0;
			for(int s:score){
				ave+=s;
			}
			ave/=n;

			int a=0;
			for(int s:score){
				a+=(s-ave)*(s-ave);
			}
			a/=n;
			System.out.println(Math.sqrt(a));
		}
	}
}