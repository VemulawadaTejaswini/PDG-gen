import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int[] nums = new int[101];
		int max = Integer.MIN_VALUE;
		
		while (true) {
			
			String s = br.readLine();
			if(s == null) break;
			nums[Integer.parseInt(s)]++;
			
		}
		
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == max) {
				ans.add(i);
			}
		}
		
		for (int a : ans) {
			System.out.println(a);
		}
	}
	
}