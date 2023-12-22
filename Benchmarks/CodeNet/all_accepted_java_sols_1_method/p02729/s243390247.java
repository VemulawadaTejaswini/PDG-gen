import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int even = sc.nextInt();
		int odd = sc.nextInt();

		sc.close();

		List<Integer> numberList = new ArrayList<Integer>();

		int evenNumber = 2;
		for (int i = 1; i <= even; i++) {
			numberList.add(evenNumber);
			evenNumber += 2;
		}

		int oddNumber = 1;
		for (int i = 1; i <= odd; i++) {
			numberList.add(oddNumber);
			oddNumber += 2;
		}

		int result = 0;
		for (int i = 0; i < numberList.size(); i++) {
			for (int j = i; j < numberList.size(); j++) {
				int parent = numberList.get(i).intValue();
				int child = numberList.get(j).intValue();

				if (parent == child) {
					continue;
				}
				if ((parent + child) % 2 == 0) {
					result++;
				}
			}
		}

		System.out.print(result);
	}
}
