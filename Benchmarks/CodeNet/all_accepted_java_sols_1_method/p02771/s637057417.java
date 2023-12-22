import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[3];
		for (int i = 0; i < 3; i++) {
			nums[i] = scan.nextInt();
		}
		
		Set<Integer> list = new HashSet<Integer>();
		int cnt = 0;
		for (int x : nums) {
			if (list.contains(x)) {
				cnt++;
			} else {
				list.add(x);
			}
		} 
		
		if (cnt == 1) {
			System.out.println("Yes");
		} else {System.out.println("No");}
		

	}

}