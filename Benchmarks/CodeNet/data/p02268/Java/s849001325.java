import java.util.Scanner;

public class Main {
	
	public static boolean valExists(int[] nums, int val) {
		
		int start = 0;
	    int end = nums.length - 1;
	    int middle = start + (end - start)/2;

	    while(start < end && nums[middle] != val) {
	        if (val < nums[middle]) {
	            end = middle - 1;
	        } else {
	            start = middle + 1;
	        }
	        middle = start + (end - start)/2;
	    }
	    
	    if (nums[middle] == val) {
	    	return true;
	    } else {
	    	return false;
	    }
		
	}
	
	public static int searchBinary(int[] nums, int[] queries) {
		
		int answer = 0;
		
		for (int i = 0; i < queries.length; i++) {
			int query = queries[i];
			if(valExists(nums, query)) {
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arrLen = scan.nextInt();
		scan.nextLine();
		int[] a = new int[arrLen];
		
		for (int i = 0; i < arrLen; i++) {
			a[i] = scan.nextInt();
		}
		scan.nextLine();
		
		int querLen = scan.nextInt();
		scan.nextLine();
		int[] b = new int[querLen];
		
		for (int i = 0; i < querLen; i++) {
			b[i] = scan.nextInt();
		}
		
		scan.close();
		
		int answer = searchBinary(a, b);
		
		System.out.println(answer);
	}
	
}
