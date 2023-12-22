import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int q = sc.nextInt();

		Queue<Process> Q = new ArrayDeque<>();

		for (int i=0; i<n; i++) {
			Q.add(new Process(sc.next(), sc.nextInt()));
		}

		int t = 0;
		while (!Q.isEmpty()) {
			Process p = Q.poll();
			if (p.time<=q) {
				t += p.time;
				System.out.println(p.name + " " + t);
			} else {
				t += q;
				p.time -= q;
				Q.add(p);
			}
		}

		sc.close();
	}

	static class Process {
		String name;
		int time;
		public Process(String name, int time) {
			this.name = name;
			this.time = time;
		}
	}

}