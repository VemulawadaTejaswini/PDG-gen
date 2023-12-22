import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		int[] nums = new int[5];
		int i = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		while(st.hasMoreTokens()) {
			nums[i++] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
		for (int j = nums.length - 1; j >= 0; j--) {
			System.out.print(nums[j]);
			if(j != 0) System.out.print(" ");
		}
		System.out.println();
		
	}
	
}