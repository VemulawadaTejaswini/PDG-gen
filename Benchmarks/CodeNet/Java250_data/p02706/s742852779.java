import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		int summerVacationCnt = stdIn.nextInt();
		int homeworkCnt = stdIn.nextInt();

		int resultCnt = summerVacationCnt;

		for (int i = 0; i < homeworkCnt; i++) {
			resultCnt -= stdIn.nextInt();
		}

		stdIn.close();

		System.out.println(resultCnt >= 0 ? resultCnt : -1);
	}

}
