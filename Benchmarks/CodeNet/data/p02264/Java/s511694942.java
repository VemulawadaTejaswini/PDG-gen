import java.util.*;

public class Main {
	class Process {
		String name;
		int time;
		Process(String name, int time) {
			this.name = name;
			this.time = time;
		}
	}
	void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int q = scanner.nextInt();
		Queue<Process> que = new LinkedList<Process>();
		for (int i = 0; i < n; i++) {
			String name = scanner.next();
			int time = scanner.nextInt();
			que.add(new Process(name, time));
		}
		for (int time = 0; !que.isEmpty();) {
			Process p = que.poll();
			if (p.time - q <= 0) {
				time += p.time;
				System.out.println(p.name + " " + time);
			} else {
				p.time -= q;
				que.add(p);
				time += q;
			}
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}

