import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Long inputNum = scanner.nextLong();
		inputNum++;
		String[] digitStr = String.valueOf(inputNum).split("");

		List<Integer> numArray = new ArrayList<>();

		for (String str : digitStr) {
			numArray.add(Integer.parseInt(str));
		}
      
		int firstNum = numArray.get(0);
		int maxSum = 0;

		for (int i = 1; i < numArray.size(); i++) {
			maxSum += 9;
		}
		maxSum += firstNum - 1;
		System.out.println(maxSum);
	}
}