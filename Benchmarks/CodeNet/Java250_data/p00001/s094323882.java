import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nums[] = new int[10];
		for(byte i = 0; i < 10; i++) 
			nums[i] = in.nextInt();
		Arrays.sort(nums);	
		System.out.println(nums[9]);
		System.out.println(nums[8]);
		System.out.println(nums[7]);
		in.close();
	}
}