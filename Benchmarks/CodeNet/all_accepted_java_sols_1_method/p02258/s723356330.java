import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int profit=-1000000000;

		int r[]=new int[n];
		r[0] = sc.nextInt();
		int nmin=r[0];

		for(int i=1;i<n;++i){
			r[i]=sc.nextInt();
			profit = Math.max(profit, r[i]-nmin);
			nmin=Math.min(nmin,r[i]);
		}

		System.out.println(profit);
	}

}
