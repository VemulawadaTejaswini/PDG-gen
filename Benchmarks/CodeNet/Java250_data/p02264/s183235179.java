import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Task> tasks = new ArrayList<>();

		int n = Integer.parseInt(sc.next());
		int q = Integer.parseInt(sc.next());

		for (int i = 0; i < n; i++) {
			String name = sc.next();
			int second = Integer.parseInt(sc.next());
			Task task = new Task(name, second);
			tasks.add(task);
		}
		int time = 0;
		while (tasks.size() != 0) {
			Task task = tasks.get(0);
			if (task.getSecond() <= q) {
				time += task.getSecond();
				System.out.print(task.getName() + " ");
				System.out.println(time);
				tasks.remove(0);

			} else {
				time += q;
				task.setSecond(task.getSecond() - q);
				tasks.add(task);
				tasks.remove(0);
			}

		}

	}

}

class Task {
	String name;
	int second;

	public Task(String name, int second) {
		this.name = name;
		this.second = second;

	}

	public String getName() {
		return name;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
}