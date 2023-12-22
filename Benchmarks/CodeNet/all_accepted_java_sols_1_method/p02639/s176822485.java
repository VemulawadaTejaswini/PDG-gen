import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> nums = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++) {
			nums.add(scanner.nextInt());
			if(nums.get(i) == 0) {
				System.out.println(i + 1);
				break;
			}
		}
		scanner.close();
	}
}