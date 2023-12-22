import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Process {
	String name;
	int time;

	public Process(String name, int time) {
		super();
		this.name = name;
		this.time = time;
	}

	public void proceed(int q) {
		this.time -= q;
	}

}

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		sc.nextLine();

		Queue<Process> queue = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			String[] input = sc.nextLine().split(" ");
			Process p = new Process(input[0], Integer.parseInt(input[1]));
			queue.add(p);
		}

		int passedTime = 0;
		while(true) {

			if(queue.isEmpty()) break;

			Process now = queue.poll();
			if(now.time > q) {
				now.proceed(q);
				passedTime += q;
				queue.add(now);
			} else {
				passedTime += now.time;
				System.out.printf("%s %d\n", now.name, passedTime);
			}
		}
	}
}