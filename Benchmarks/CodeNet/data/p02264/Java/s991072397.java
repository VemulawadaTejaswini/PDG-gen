import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void runSchedule(Queue<String[]> tasks, int quantum) {
		int totalTime = 0;
		
		while (!tasks.isEmpty()) {
			String[] elem = tasks.poll();
			int reqTime = Integer.valueOf(elem[1]);
			int timeElapsed = quantum - reqTime;
			
			if (timeElapsed >= 0) {
				totalTime += reqTime;
				System.out.println(elem[0] + " " + totalTime);
			} else {
				totalTime += quantum;
				elem[1] = String.valueOf(timeElapsed * -1);
				tasks.add(elem);
			}
		}
		
		
	}
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nTasks = scan.nextInt();
		int quantum = scan.nextInt();
		scan.nextLine();
		
		Queue<String[]> tasks = new ArrayDeque<>();
		
		for (int i = 0; i < nTasks; i++) {
			String[] str = scan.nextLine().split(" ");
			tasks.add(str);
		}
		scan.close();
		
		runSchedule(tasks, quantum);
	}

}

