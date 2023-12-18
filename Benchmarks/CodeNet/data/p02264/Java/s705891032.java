import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.Integer.parseInt;

/**
 * Elementary data structures - Queue
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		// read
		line = br.readLine();
		int n = parseInt(line.substring(0, line.indexOf(' ')));
		int q = parseInt(line.substring(line.indexOf(' ') + 1));
		Deque<Process> queue = new ArrayDeque<Process>();

		for (int i = 0; i < n; i++) {
			line = br.readLine();
			String name = line.substring(0, line.indexOf(' '));
			int time = parseInt(line.substring(line.indexOf(' ') + 1));
			queue.offer(new Process(name, time));
		}

		// solve
		int elapse = 0;
		StringBuilder sb = new StringBuilder();
		while (!queue.isEmpty()) {
			Process p = queue.poll();
			if (p.time <= q) {
				elapse += p.time;
				sb.append(p.name + " " + elapse + "\n");
			} else {
				p.time -= q;
				elapse += q;
				queue.offer(p);
			}
		}
		System.out.print(sb);
	} //end main
}

class Process {
	String name;
	int time;

	Process(String name, int time) {
		this.name = name;
		this.time = time;
	}
}