

import java.util.Scanner;

public class Main{
	
	static int[][] nums;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		nums = new int[N][10];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 10; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < N; i++) {
			int top1 = 0,top2=0;
			boolean flag=true;
			for (int j = 0; j < 10; j++) {
				if(nums[i][j]>=top1) top1=nums[i][j];
				else if(nums[i][j]>=top2) top2=nums[i][j];
				else {
					flag=false;
					break;
				}
			}
			if(flag) System.out.println("YES");
			else System.out.println("NO");
			
		}
		
		
		
	}
	
	
	

}

