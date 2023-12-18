import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		
		int[] nums = new int[Integer.parseInt(scin.nextLine())];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(scin.nextLine());
		}
		
		System.out.println(primeNumberCounter(nums));
	}
	
	public static int primeNumberCounter(int nums[]) {
		
		int output = 0;
		
		for (int i = 0; i < nums.length; i ++) {
			int tgt_num = nums[i];
			boolean isPrime = true;
			if (tgt_num%2==0) {
				isPrime= false;
			}
		    //if not, then just check the odds
		    for(int x=3;x*x<=tgt_num;x+=2) {
		        if(tgt_num%x==0) {
		        	isPrime= false;
		        	break;
		        }
		            
		    }
			if (isPrime || tgt_num == 2) {
				output += 1;
			}
		}
		
		
		return output;
	}
}
