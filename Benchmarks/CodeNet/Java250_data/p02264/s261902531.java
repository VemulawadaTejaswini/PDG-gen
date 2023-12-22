import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num, quantum = 0;
		int time = 0; // time;総時間数
		Queue<String> qName = new ArrayDeque<String>();
		Queue<Integer> qTime = new ArrayDeque<Integer>();

		num = scan.nextInt(); // 入力数
		quantum = scan.nextInt(); // クオンタム（実行する処理時間）
		scan.nextLine();

		for (int i = 0; i < num; i++) {
			qName.add(scan.next());
			qTime.add(scan.nextInt());
		}

		while (!qName.isEmpty()) {
			String qNamePolled = qName.poll();
			int getTime = qTime.poll();

			if (getTime > quantum) { // 総時間数をカウントしていく
				time = time + quantum;
			} else {
				time = time + getTime;
			}

			if (getTime > quantum) {
				qTime.add(getTime - quantum);
				qName.add(qNamePolled);
			} else { // 今のプロセス処理終了
				System.out.println(qNamePolled + " " + time);
			}
		}
		scan.close();
	}
}

