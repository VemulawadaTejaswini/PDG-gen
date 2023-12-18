import java.util.Scanner;

 class Main{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if (input >= 0 && input <= 86400) {
			int h = input / 3600;
			int m = (input%3600)/60;
			int s = (input%3600)%60;
			System.out.println(h + ":" + m + ":" + s);
		}
	}
}

