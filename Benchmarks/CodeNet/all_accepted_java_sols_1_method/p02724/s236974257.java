import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int countFiveHundred = x/500;
		int points = countFiveHundred*1000;
		x = x - (countFiveHundred*500);
		points += (x/5)*5;
		System.out.println(points);
	}
}