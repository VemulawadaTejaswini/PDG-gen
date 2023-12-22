import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int vacation = scanner.nextInt();
		int homeworkNumber = scanner.nextInt();
		int[] daysSpentInHomework = new int[homeworkNumber];
		int studyDay = 0;

		for (int i = 0; i < homeworkNumber; i++) {
			daysSpentInHomework[i] = scanner.nextInt();
		}

		for (int j = 0; j < homeworkNumber; j++) {
			studyDay = studyDay + daysSpentInHomework[j];
		}

		int playable;

		if (vacation - studyDay >= 0) {
			playable = vacation - studyDay;
			System.out.println(playable);
		} else {
			System.out.println("-1");
		}

		scanner.close();

	}

}
