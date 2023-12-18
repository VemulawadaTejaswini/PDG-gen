import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> result = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		String[] num = sc.nextLine().split(" ");

		for (int i = 0; i < num.length; i++) {
			if (num[i].matches("^[0-9]*$")) {
				result.add(Integer.parseInt(num[i]));
			} else {
				int num1 = result.get(result.size() - 2);
				int num2 = result.get(result.size() - 1);
				if (num[i].equals("+")) {
					result.set(result.size() - 2, num1 + num2);
				} else if (num[i].equals("-")) {
					result.set(result.size() - 2, num1 - num2);
				} else if (num[i].equals("*")) {
					result.set(result.size() - 2, num1 * num2);
				}
				result.remove(result.size() - 1);
			}
		}

		System.out.println(result.get(0));
	}
}
