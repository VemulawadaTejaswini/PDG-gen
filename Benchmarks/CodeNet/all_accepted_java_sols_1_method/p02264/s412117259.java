import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<String> nameQueue = new ArrayDeque<>();
		Queue<Integer> timeQueue = new ArrayDeque<>();
		int time = 0;

		// プロセス数とクオンタムを読み込む
		int num = scan.nextInt();
		int quantum = scan.nextInt();

		// 各プロセスの情報を読み込む
		for(int i = 0; i < num; i++) {
			nameQueue.add(scan.next());
			timeQueue.add(scan.nextInt());
		}

		// ラウンドロビンスケジューリング
		while(!timeQueue.isEmpty()) {
			if(timeQueue.peek() > quantum) {
				timeQueue.add(timeQueue.poll() - quantum);
				nameQueue.add(nameQueue.poll());
				time += quantum;
			} else {
				time += timeQueue.poll();
				System.out.print(nameQueue.poll() + " ");
				System.out.println(time);
			}

		}

	}
}

