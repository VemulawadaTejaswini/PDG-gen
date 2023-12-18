import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int [] nums = new int[a];
		for (int i = 0; i <a; i++) {
			int ai = s.nextInt();
			nums[i]=ai;
		}
		Arrays.sort(nums);
		double fix = nums[0];
		for (int i = 1; i <a; i++) {
			fix = (fix+nums[i])/2;
		}
		System.out.println(fix);
		

	}

}
