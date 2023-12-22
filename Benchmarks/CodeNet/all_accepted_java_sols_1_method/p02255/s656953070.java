import java.util.Scanner;

public class Main{
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int length = Integer.parseInt(scan.nextLine());
		String[] numStrings = scan.nextLine().split(" ");
		int[] nums = new int[length];
		for(int i = 0; i < length; i++)
			nums[i] = Integer.parseInt(numStrings[i]);
		
		for(int n = 0; n < length; n++) {
			System.out.print(nums[n]);
			if(n < length - 1)
				System.out.print(" ");
		}
		System.out.println();
		
		for(int i = 1; i < nums.length; i++) {
			int current = nums[i];
			
			int index = 0;
			while(current > nums[index] && index < i)
				index++;
			
			for(int n = i; n > index; n--)
				nums[n] = nums[n - 1];
			
			nums[index] = current;
		
			for(int n = 0; n < length; n++) {
				System.out.print(nums[n]);
				if(n < length - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

