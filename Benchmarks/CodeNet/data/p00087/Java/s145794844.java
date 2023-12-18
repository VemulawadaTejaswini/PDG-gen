
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			String[] line = scanner.nextLine().split(" ");
			Deque<Double> deque = new ArrayDeque<Double>();
			for (int i = 0; i < line.length; i++) {
				if (Character.isDigit(line[i].charAt(0))
						|| line[i].length() > 1) {
					deque.push(Double.parseDouble(line[i]));
				} else {
					double a = deque.pop();
					double b = deque.pop();
					if (line[i].equals("+")) {
						deque.push(b + a);
					} else if (line[i].equals("-")) {
						deque.push(b - a);
					} else if (line[i].equals("*")) {
						deque.push(b * a);
					} else {
						deque.push(b / a);
					}
				}
			}
			System.out.println(deque.pop());
		}
	}
}