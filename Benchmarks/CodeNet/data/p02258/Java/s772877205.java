import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int r[] = new int[n];
		int profit=0;

		for (int i=0;i<n;++i){
			r[i]= sc.nextInt();
		}

		for (int i=0;i<n-1;++i){
			for (int j=1+i;j<n;++j){
				profit = Math.max(profit, r[j]-r[i]);
			}
		}

		System.out.println(profit);
	}

}
