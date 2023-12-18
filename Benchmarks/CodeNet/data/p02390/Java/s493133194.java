import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input= sc.nextLine();

		int inputTime = Integer.parseInt(input);
		int hour = 0;
		int minute = 0;

		while(inputTime >= 3600) {
			if ((inputTime -= 3600) >= 0) {
				hour++;
			}
		}

		while(inputTime >= 60) {
			if ((inputTime -= 60) >= 0) {
				minute++;
			}
		}
		System.out.println(hour + ":" + minute + ":" + inputTime);

	}
}

