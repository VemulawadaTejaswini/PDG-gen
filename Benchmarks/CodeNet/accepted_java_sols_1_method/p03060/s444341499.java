
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int juelSize = Integer.parseInt(sc.nextLine());
			String[] value = sc.nextLine().split(" ");
			String[] cost = sc.nextLine().split(" ");
			
			int sum = 0;
			
			for (int i = 0; i < juelSize; i++) {
				int benefit = Integer.parseInt(value[i]) - Integer.parseInt(cost[i]);
				if (benefit > 0) {
					sum += benefit;
				}
			}
			
			System.out.println(sum);
			
		}
	}

}
