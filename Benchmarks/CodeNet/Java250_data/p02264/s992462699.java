
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numProcesses = in.nextInt();
		int quantum = in.nextInt();
		Main r = new Main();
		Queue<Process> q = new LinkedList<Process>();

		for (int i = 1; i <= numProcesses; i++) {
			Process p = r.new Process(in.next(), in.nextInt());
			q.add(p);
		}

		performQOps(q, quantum);
	}

	public static void performQOps(Queue<Process> q, int quantum) {
		int totalTime = 0;

		while (q.size() != 0) {

			Process cur = q.poll();

			if (cur.getTimeRemaining() <= quantum) {
				totalTime += cur.getTimeRemaining();
				System.out.println(cur + " " + totalTime);
			} else {
				totalTime += quantum;
				cur.setTimeRemaining(cur.getTimeRemaining() - quantum);
				q.add(cur);
			}
		}
	}

	private class Process {

		String name;
		int timeRemaining;

		public Process(String name, int timeRemaining) {
			this.name = name;
			this.timeRemaining = timeRemaining;
		}

		public String getName() {
			return name;
		}

		public int getTimeRemaining() {
			return timeRemaining;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setTimeRemaining(int timeRemaining) {
			this.timeRemaining = timeRemaining;
		}

		public String toString() {
			return name;
		}
	}
}

