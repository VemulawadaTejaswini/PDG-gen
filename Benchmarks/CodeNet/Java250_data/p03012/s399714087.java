import java.util.Scanner;


public class Main{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int sum=0;
		int t[]=new int[n];

		for(int i=0;i<n;++i){
			sum=sum+sc.nextInt();
			t[i]=sum;
		}
		int ans=sum;
		for(int i=0;i<n;++i){
			int a=Math.abs(sum-2*t[i]);
			if(ans>a) ans=a;
		}

		System.out.println(ans);
	}
}