import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		// input
		final long NUM = scan.nextLong();
		int keta = 0;
		long temp = NUM;
		int[] nums = new int[20];
		int i = 0;
		int def = 0;
		while(temp > 0){
			nums[i++] = (int)(temp % 10);
			def += nums[i-1];
			temp /= 10;
			keta++;
		}
		
		// search
		int sum = 0;
		for(int j = 0; j < keta; j++){
			if(j == keta - 1){
				sum += nums[j] - 1;
			} else {
				sum += 9;
			}
		}
		
		// answer
		if(sum > def){
			System.out.println(sum);
		} else {
			System.out.println(def);
		}
		
	}
}