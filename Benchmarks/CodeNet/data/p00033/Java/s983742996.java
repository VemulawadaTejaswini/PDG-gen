

import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fnum=0,snum=0;
		int n = sc.nextInt();
		int[][] nums = new int[n][];
		
		for (int i = 0; i < n; i++) {
			nums[i] = new int[10];
			for (int j = 0; j < 10; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		boolean flag = true;
		for (int i = 0; i < nums.length; i++) {
			flag = true;
			for (int j = 0; j < nums[i].length; j++) {
				if(nums[i][j]>fnum) fnum = nums[i][j];
				else if(nums[i][j]>snum) snum=nums[i][j];
				else {
					flag = false;
					break;
				}
			}
			if(flag) System.out.println("YES");
			else System.out.println("NO");
			
		}
		
	}

}

