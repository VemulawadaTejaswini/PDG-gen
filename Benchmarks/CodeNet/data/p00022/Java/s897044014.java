import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Main {
	
	public static int maxCalc (int[] nums) {
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		
		// いくつ連続でとるか
		for (int i = 1; i <= nums.length; i++) {
			
			// どこから取り始めるか
			for (int j = 0; j < nums.length - i + 1; j++) {
				
				sum = 0;
				int cnt = 0;
				
				// 取った数がiになるまで繰り返し
				for (int k = j; cnt < i; k++,cnt++) {
					sum += nums[k];
				}
				max = Math.max(sum, max);
				
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