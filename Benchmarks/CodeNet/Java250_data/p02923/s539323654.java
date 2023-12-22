import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		int answer = 0;

		// 入力を受け取る
		final int NUM = scan.nextInt();
		int[] step = new int[NUM];
		boolean[] jump = new boolean[NUM - 1];
		for(int i = 0; i < NUM; i++) {
			step[i] = scan.nextInt();
		}

		for(int i = 0; i < NUM-1; i++) {
			if(step[i] < step[i+1]) {
				jump[i] = false;
			} else {
				jump[i] = true;
			}
		}

		for(int i = 0; i < NUM - 1; i++) {
			if(jump[i]) {
				count++;
			} else {
				if(count > answer) {
					answer = count;
				}
				count = 0;
			}
		}

		if(count > answer) {
			answer = count;
		}
		System.out.println(answer);

	}
}
