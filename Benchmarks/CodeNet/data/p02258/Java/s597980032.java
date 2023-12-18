
import java.util.*;
//alg 2 submission
public class Main {
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		
		int[] nums = new int[Integer.parseInt(scin.nextLine())];
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(scin.nextLine());
		}
		
		//System.out.println(alg1(nums));
		System.out.println(alg2(nums));
	}
	
	static int alg1(int[] inputs) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < inputs.length - 1; i++) {
			for(int j = i + 1; j < inputs.length; j++) {
				if(inputs[j] - inputs[i] > max) {
					max = inputs[j] - inputs[i];
				}
			}
		}
		
		if (inputs.length < 2){
			return 0;
		}
		
		return max;
	}
	
	static int alg2(int[] inputs) {
		if (inputs.length < 2) {
			return 0;
		}
		int minCurVal = inputs[0];
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < inputs.length; i++) {
			if(inputs[i] - minCurVal > max) {
				max = inputs[i] - minCurVal;
			}
			
			if (inputs[i] < minCurVal) {
				minCurVal = inputs[i];
			}
			
		}
		return max;
	}
}

