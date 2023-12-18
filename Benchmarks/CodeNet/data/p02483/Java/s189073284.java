import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = 
    		new BufferedReader(new InputStreamReader(System.in));
    	
    	StringTokenizer st = new StringTokenizer(br.readLine()," ");
    	
    	int nums[] = new int[3];
    	
    	for (int i = 0; i < nums.length; i++) {
    		nums[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	Arrays.sort(nums);
    	for (int num : nums) {
    		System.out.print(num + " ");
    	}
   }
}