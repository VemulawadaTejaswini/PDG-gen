import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int w = scan.nextInt();
		int[] dl = new int[w];
		for(int i = 0; i < w; i++){
			dl[i] = i + 1;
		}
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			String input = scan.next();
			String[] nums = input.split(",");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			int work = dl[a - 1];
			dl[a - 1] = dl[b - 1];
			dl[b - 1] = work;
		}

		for(int i = 0; i < w; i++){
			System.out.printf("%d\n", dl[i]);
		}
	}
}