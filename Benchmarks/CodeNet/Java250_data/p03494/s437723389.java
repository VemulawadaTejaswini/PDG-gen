import java.util.*;
 
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N + 1];
        for (int i = 0; i < N; i++) {
        	nums[i] = sc.nextInt();
        }
        
        int count = 0;
        while (isAllOdd(nums)) {
        	for (int i = 0; i < N; i++) {
            	nums[i] = nums[i] / 2;
            }
            ++count;
        }
        System.out.println(count);
    }
  
    private static boolean isAllOdd(int[] nums) {
    	for (int i = 0; i < nums.length; i++) {
        	if (nums[i] % 2 != 0) {
            	return false;
            } 
        }
        return true;
    }
}