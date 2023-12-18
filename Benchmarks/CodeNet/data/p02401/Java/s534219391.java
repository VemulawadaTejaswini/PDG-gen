public class Main {

	public static void main(String[] args) {
		{
			Scanner stdin = new Scanner(System.in);
			List<Integer> result = new ArrayList<>();
			int i = 0, count = 0;
			while (true) {
				String[] input = stdin.nextLine().split(" ");
				int num1 = 0;
				int num2 = 0;
				char operation = 0;
				num1 = Integer.parseInt(input[0]);
			    operation = input[1].charAt(0);
			    num2 = Integer.parseInt(input[2]);
				if (operation == '?') {
					break;
				}
				switch (operation) {
				case '+':
					result.add(num1 + num2);
					break;

				case '-':
					result.add(num1 - num2);
					break;
				case '*':
					result.add(num1 * num2);
					break;
				case '/':
					result.add(num1 / num2);
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