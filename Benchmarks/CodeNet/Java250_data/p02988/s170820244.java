import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] nums = new int[n];
      	for (int i = 0; i < n; i++) {
        	nums[i] = sc.nextInt();
        }
    	
      	int res = 0;
      	
    	for (int i = 1; i < nums.length - 1; i++) {
        	if (((nums[i-1] < nums[i]) && (nums[i] < nums[i+1])) || ((nums[i-1] > nums[i]) && (nums[i] > nums[i+1])))
        		res++;
        }
      	
      	System.out.println(res);
    }
}