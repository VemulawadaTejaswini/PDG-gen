import java.io.*;
import java.util.*;
class Main {
	
	public static int solve(int n , int x) {
		
		int sum = 0;
		
		int[] nums = new int[n];
		for (int i = 1; i <= n; i++)
			nums[i - 1] = i;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if(nums[i] + nums[j] + nums[k] == x)
						sum++;
				}
			}
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		int n, x;
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			n = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			
			if (n == 0 && x == 0) break;
			
			result.add(solve(n, x));
		}
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	
}