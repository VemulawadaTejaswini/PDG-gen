import java.util.Scanner;

public class Main {

	static int min = Integer.MAX_VALUE;
	static int odd_min = Integer.MAX_VALUE;
	static int limit = 180;

	 public static void main(String[] args)throws Exception{

		 limit = 1000000;

		 int[] dp = new int[limit];
		 int[] dp_odd = new int[limit];
		 
		 for(int i=0;i<limit;i++)
		 {
			 dp[i]=i; 
			 dp_odd[i]=i;
		 }

		 for(int i=2;i<181;i++)
		 {
			 int frame = i * (i+1) * (i+2) /6;
			 
			 int count = 0;
			 for(int j=1;j<limit;j++)
			 {
				 if(j % frame == 0){
				 	 dp[j] =j /frame; 
				     count++;
				 }
				 else
					 dp[j] = Math.min(dp[j % frame] + count,dp[j]);
			 }
		 }
		 

		 for(int i=2;i<181;i++)
		 {
			 int frame = i * (i+1) * (i+2) /6;
			 
			 if(frame % 2 ==0)
				 continue;
			 
			 int count = 0;
			 for(int j=1;j<limit;j++)
			 {
				 if(j % frame == 0){
				 	 dp_odd[j] =j /frame; 
				     count++;
				 }
				 else
					 dp_odd[j] = Math.min(dp_odd[j % frame] + count,dp_odd[j]);
			 }
		 }
		 

		 Scanner sc = new Scanner(System.in);

		 while(true)
		 {
			 int n = sc.nextInt();

			 if(n == 0)
				 return;

			 System.out.print(dp[n]);
			 System.out.print(" ");
			 System.out.println(dp_odd[n]);

		 }

	 }

}