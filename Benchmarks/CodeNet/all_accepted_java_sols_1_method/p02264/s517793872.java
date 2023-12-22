import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		final int t = scan.nextInt();
		int totalTime = 0;

		Deque<String> queueName = new ArrayDeque<String>();
		Deque<Integer> queueTime = new ArrayDeque<Integer>();

		for(int i = 0; i < n; i++) {
			queueName.addLast(scan.next());
			queueTime.addLast(scan.nextInt());
		}

		while(!queueName.isEmpty()) {
			String procName = queueName.pollFirst();
			int procTime = queueTime.pollFirst();
			if(procTime <= t) {
				System.out.println(procName + " " + (procTime + totalTime));
				totalTime += procTime;
			} else {
				queueName.addLast(procName);
				queueTime.addLast(procTime - t);
				totalTime += t;
			}
		}
		scan.close();
	}
}
