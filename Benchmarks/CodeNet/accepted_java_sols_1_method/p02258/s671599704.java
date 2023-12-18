import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int len = scanner.nextInt();
		List<Integer> nums = new ArrayList<Integer>() ;
		for (int i = 0; i < len; i++) {
			nums.add(scanner.nextInt());
		}
		
		int min = nums.get(0);
		int profit = -1000000000;
		for (int i = 1; i < len; i++) {
			if (profit<(nums.get(i)-min)) {
				profit = nums.get(i)-min;
			}
			if (nums.get(i)<min) {
				min = nums.get(i);
			}
		}
		
		System.out.println(profit);
	}

}
