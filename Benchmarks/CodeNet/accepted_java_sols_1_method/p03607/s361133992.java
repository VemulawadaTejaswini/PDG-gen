import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		// input
		final int NUM = scan.nextInt();
		int[] nums = new int[NUM];
		for(int i = 0; i < NUM; i++){
			nums[i] = scan.nextInt();
		}
		
		//sort
		Arrays.sort(nums);
		
		// search
		Deque<Integer> stack = new ArrayDeque<>();
		for(int i = 0; i < NUM; i++){
			if(stack.size() > 0 && stack.peek() == nums[i]){
				stack.pop();
			} else {
				stack.push(nums[i]);
			}
			
		}
		
		// answer
		System.out.println(stack.size());
	}
}