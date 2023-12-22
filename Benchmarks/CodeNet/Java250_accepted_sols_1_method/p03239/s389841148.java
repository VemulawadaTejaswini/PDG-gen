import java.util.Scanner;

public class Main {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		String firstInput = scan.nextLine();
		int inputCount = Integer.parseInt(firstInput.substring(0, firstInput.indexOf(" ")));
		int minTime = Integer.parseInt(firstInput.substring(firstInput.indexOf(" ")+1));
		int minCost = 1001;
		for(int i = 0; i < inputCount; i++) {
			String input = scan.nextLine();
			int cost = Integer.parseInt(input.substring(0, input.indexOf(" ")));
			int time = Integer.parseInt(input.substring(input.indexOf(" ")+1));

			if(cost < minCost && time <= minTime) {
				minCost = cost;
			}
		}
		if(minCost < 1001) {
			System.out.println(minCost);
		} else {
			System.out.println("TLE");
		}
	}
}