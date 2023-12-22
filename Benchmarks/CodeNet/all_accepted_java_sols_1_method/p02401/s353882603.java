import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		{
			Scanner stdin = new Scanner(System.in);
			List<Integer> result = new ArrayList<>();
			int i = 0, count = 0;
			while (true) {
				String[] input = stdin.nextLine().split(" ");
				int a = 0;
				int b = 0;
				char operation = 0;
				a = Integer.parseInt(input[0]);
			    operation = input[1].charAt(0);
			    b = Integer.parseInt(input[2]);
				if (operation == '?') {
					break;
				}
				switch (operation) {
				case '+':
					result.add(a + b);
					break;

				case '-':
					result.add(a - b);
					break;
				case '*':
					result.add(a * b);
					break;
				case '/':
					result.add(a / b);
					break;
				}
				count = i;
				i++;
			}
			for (int j = 0; j < result.size(); j++) {
				System.out.println(result.get(j));
			}
		}
	}
}