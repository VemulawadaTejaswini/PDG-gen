import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int sumMoney = 0;
		int sumStock = 0;
		int count = 0;
		while (true) {
            String input = stdin.next();
            if (input == null) {
                break;
            }
            String[] temp = input.split(",");
            sumMoney += Integer.parseInt(temp[0]) * Integer.parseInt(temp[1]);
            sumStock += Integer.parseInt(temp[1]);
            count++;
        }
		int average = (int) Math.round(sumMoney / (double) count);
		System.out.println(sumMoney);
		System.out.println(average);

	}

}