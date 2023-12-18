import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		String[] nums = new String[n];
		int sum = 0;
		if(n>0 && 0<=10000) {
			String seq = s.nextLine();
			nums = seq.split(" ");
			for(int i=0;i<n;i++) {
				if(Integer.parseInt(nums[i])>=-1000000 && Integer.parseInt(nums[i])<=1000000) {
					sum += Integer.parseInt(nums[i]);
				}
				
			}
			Arrays.sort(nums);
			System.out.println(nums[0]+" "+nums[n-1]+" "+sum);
			
		}
		
		
		
		
	}

}