import java.util.LinkedList;
import java.util.Scanner;

class Task {
	public String name;
	public int time;
	
	Task(String name, int time) {
		this.name = name;
		this.time = time;
	}
}
public class Main{
	static LinkedList<Task> queue = new LinkedList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sumTime = 0;
		
		int taskNum = sc.nextInt();
		int levelTime = sc.nextInt();
		
		if(taskNum < 1 || taskNum > 100000)
			return;
		if(levelTime < 1 || levelTime > 1000)
			return;
		
		for (int i = 0; i < taskNum; i++) {
			 queue.offer(new Task(sc.next(), sc.nextInt()));
		}
		
		
		while(!queue.isEmpty()) {
			Task task = queue.poll();
			
			if(task.time <= levelTime) {
				sumTime += task.time;
				System.out.println(task.name + " " + sumTime);
			} else {
				task.time -= levelTime;
				sumTime += levelTime;
				queue.offer(task);
			}
		}
	}
}