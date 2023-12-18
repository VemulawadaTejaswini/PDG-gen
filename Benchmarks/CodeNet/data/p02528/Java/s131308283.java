import java.io.*;
import java.util.*;
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		for(int j = 0; j < nums.length; j++)
			nums[j] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(nums);
		
		for (int j = 0; j < nums.length; j++) {
			System.out.print(String.valueOf(nums[j]));
			if (j != nums.length - 1)
				System.out.print(" ");
		}
	}
	
}