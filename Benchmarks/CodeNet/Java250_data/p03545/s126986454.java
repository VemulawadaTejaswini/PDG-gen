import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputs = scanner.nextLine().split("");
		int[] nums = new int[4];
		for (int i = 0; i < 4; i++) {
			nums[i] = Integer.parseInt(inputs[i]);
		}

		int[] masks = {4, 2, 1};

		for (int opes = 0; opes < 8; opes++) {
			int result = nums[0];
			for (int opeIndex = 0; opeIndex < 3; opeIndex++) {
				if ((opes & masks[opeIndex]) > 0) {
					result += nums[opeIndex + 1];
				} else {
					result -= nums[opeIndex + 1];
				}
			}
			if (result == 7) {
				String[] operators = String.format("%3s", Integer.toBinaryString(opes)).replaceAll("[ 0]", "-").replaceAll("1", "+").split("");
				StringBuilder expression = new StringBuilder();
				expression.append(inputs[0]);
				for (int i = 0; i < 3; i++) {
					expression
						.append(operators[i])
						.append(inputs[i + 1]);
				}
				expression
					.append("=7");
				System.out.println(expression);
				return;
			}
		}
	}
}
