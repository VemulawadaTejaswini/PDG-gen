import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (num > 0 && num <= 10000) {
			int array[] = new int[num];
			List<Integer> list = new ArrayList<Integer>();
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				int next = scanner.nextInt();
				list.add(next);				
			}
			for (int j: list) {
		        sum += sum+j;
		    }
			if (list.size() >= -1000000 && list.size() <= 1000000) {
				int minimumValue = Collections.min(list);
				int maximumValue = Collections.max(list);
				System.out.println(minimumValue + " " + maximumValue + " " + sum);
			}
		}
	}
}