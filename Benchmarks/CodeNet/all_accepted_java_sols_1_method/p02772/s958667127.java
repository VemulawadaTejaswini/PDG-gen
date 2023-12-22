import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = "DENIED";

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(num % 2 == 0) nums.add(num);
		}

		if(nums.size() == 0) {
			a = "APPROVED";
		} else {
			for(int i = 0; i < nums.size(); i++) {
				if(nums.get(i) % 3 == 0 || nums.get(i) % 5 == 0) {
					if(i == nums.size() - 1) a = "APPROVED";
				} else {
					break;
				}
			}
		}

		System.out.println(a);
	}
}