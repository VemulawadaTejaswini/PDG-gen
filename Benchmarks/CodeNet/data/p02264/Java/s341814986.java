/*
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ALDS1_3_B&lang=jp
 */
import java.util.*;

class Task {
	String name;
	int time;
	int endTime;
	Task(String name, int time) {
		this.name = name;
		this.time = time;
	}
	void setEndTime(int x) {
		this.endTime = x;
	}
}

public class Main {
	
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int q = scan.nextInt();
		Task[] tasks = new Task[n];
		for (int i = 0; i < n; i++) {
			String name = scan.next();
			int time = scan.nextInt();
			tasks[i] = new Task(name, time);
		}

		Task[] result = new Task[n];
		int topOfResult = 0;
		
		int time = 0;
		int idx = 0;
		while (topOfResult < tasks.length) {
			if (tasks[idx].time > q) {
				tasks[idx].time -= q;
				time += q;
			} else if (tasks[idx].time > 0) {
				time += tasks[idx].time;
				tasks[idx].time = 0;
				tasks[idx].setEndTime(time);
				result[topOfResult++] = tasks[idx];
			}
			if (++idx >= tasks.length) idx = 0;
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i].name + " " + result[i].endTime);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}

