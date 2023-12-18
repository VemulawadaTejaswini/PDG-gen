import java.util.Scanner;

public class Main {
	static int compute_maxprofit(int n,int[] R){
	      int max_profit = R[1] - R[0];
	      int min_profit = R[0];
	      for(int i = 1; i < n; i++) 
	      {
			if(max_profit < R[i] - min_profit)
				max_profit = R[i] - min_profit;
		if(min_profit > R[i]) {min_profit = R[i];}
		  }
	      
	      return max_profit;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] R = new int[num] ;
		for(int h = 0;h<num;h++) 
		{
			R[h] = in.nextInt();
		}
		System.out.println(compute_maxprofit(R.length,R));
in.close();
	}

}

