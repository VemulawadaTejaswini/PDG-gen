
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		int numCount = Integer.parseInt(scin.nextLine());
		String[] vals = scin.nextLine().split(" ");
		
		int[] nums = new int[vals.length];
		for (int i = 0; i < vals.length; i++) {
			nums[i] = Integer.parseInt(vals[i]);
		}
		
		for (int i = 0; i < nums.length; i++) {
			String out = "node " + (i+1) + ": key = " + nums[i] + ", ";
			int parrentVal = (i + 1) / 2;
			if (parrentVal > 0) {
				out += "parent key = " + nums[parrentVal - 1] + ", ";
			}
			
			int leftVal = (2 * (i + 1));
			if (leftVal - 1 < nums.length) {
				out += "left key = " + nums[leftVal - 1] + ", ";
					
				//left key = 2, right key = 3, 
			}
			
			int rightVal = (2 * (i + 1)) + 1;
			if (rightVal - 1 < nums.length) {
				out += "right key = " + nums[rightVal - 1] + ", ";
					
				//left key = 2, right key = 3, 
			}
				
			System.out.println(out);
		}
		
	}
	
	
}
