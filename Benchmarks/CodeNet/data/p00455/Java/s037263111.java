import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] enter_time = new int[3];
		int[] leave_time = new int[3];

		while (sc.hasNext()) {
			for (int i = 0; i < 3; i++) {
				enter_time[i] = sc.nextInt();
			}

			for (int i = 0; i < 3; i++) {
				leave_time[i] = sc.nextInt();
			}

			timeCalculatror(enter_time, leave_time);
		}


	}
	private static void timeCalculatror(int[] enter_time, int[] leave_time) {
		int time_ans = 3600 * (leave_time[0] - enter_time[0]) +
						60 *  (leave_time[1] - enter_time[1]) +
							  (leave_time[2] - enter_time[2]);

		int[] a_hms = new int[3];

		a_hms[0] = time_ans / 3600;
		a_hms[1] = (time_ans % 3600) / 60;
		a_hms[2] = time_ans % 60;

		System.out.printf("%d %d %d\n", a_hms[0], a_hms[1], a_hms[2]);
	}


}
