import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.ws.AsyncHandler;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		int nums[] = new int[len] ;
		for (int i = 0; i < len; i++) {
			nums[i] = scanner.nextInt();
		}
		
		for (int i = 1; i < nums.length; i++) {
			new Main().arrayToString(nums);
			int val = nums[i];
			int preIndex = i-1;
			while (preIndex>=0 && nums[preIndex] > val) {
				nums[i] = nums[preIndex];
				nums[preIndex] = val;
				preIndex--;
			}
		}
	}
	
	public void arrayToString(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
