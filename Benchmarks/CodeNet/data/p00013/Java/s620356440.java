import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayDeque<Integer> cars = new ArrayDeque<Integer>();
		while (scanner.hasNext()) {
			int number = scanner.nextInt();
			if (number == 0) System.out.println(cars.pollLast());
			else cars.addLast(number);
		}
	}
}