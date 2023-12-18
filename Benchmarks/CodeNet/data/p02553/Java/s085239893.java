import java.util.*;
class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long[] nums = new long[4];
		for(int i = 0; i < 4; i++) {
			nums[i] = scanner.nextInt();
		}
		long result = nums[0] * nums[2];
		if(result < nums[0]*nums[3])result = nums[0]*nums[3];
		if(result < nums[1]*nums[2])result = nums[1]*nums[2];
		if(result < nums[1]*nums[3])result = nums[1]*nums[3];
		System.out.println(result);
		scanner.close();
	}
}