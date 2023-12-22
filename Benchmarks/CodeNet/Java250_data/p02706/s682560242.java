import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int day = sc.nextInt();
		int work_count = sc.nextInt();

		int homework [] = new int[work_count];

		for (int i = 0; i < work_count; i++) {
			homework[i] = sc.nextInt();
		}

		int sum = 0;

		for (int i = 0; i < work_count; i++) {
			sum += homework[i];
		}

		if (day >= sum) {
			System.out.print(day - sum);
		} else {
			System.out.print(-1);
		}

	return;

	}
}
