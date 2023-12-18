import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] nums = new int[]{a,b,c};
		
		Arrays.sort(nums);
		
		System.out.print(nums[0]);
		for (int i = 1; i < nums.length; i++)
			System.out.print(" " + nums[i]);
		
		System.out.println();
		
		sc.close();

	}

}