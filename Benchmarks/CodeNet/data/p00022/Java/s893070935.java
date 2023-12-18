import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
	
	public static int maxCalc (int[] nums) {
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		// どこから取り始めるか
		for (int i = 0; i < nums.length; i++) {
			sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				max = Math.max(max, sum);
			}
			
		}
		
		return max;
		
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while (true) {
			
			int n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			int[] nums = new int[n];
			for (int i = 0; i < n; i++)
				nums[i] = Integer.parseInt(br.readLine());
			ans.add(maxCalc(nums));
			
		}
		
		for (int a : ans) {
			System.out.println(a);
		}
		
	}

}