import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < 3; i++) {
			nums.add(sc.nextInt());
		}
		Collections.sort(nums);
		int k = sc.nextInt();

		int sum = 0;
		for(int i = 0; i < 3; i++) {
			if(i == 2) {
				int tmp = nums.get(i);
				for(int j = 0; j < k; j++) {
					tmp *= 2;
				}
				sum += tmp;
			} else {
				sum += nums.get(i);
			}
		}
		System.out.println(sum);
	}
}
