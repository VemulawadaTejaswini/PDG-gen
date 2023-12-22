import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 class Node{
	
	String name;
	int time;
	
	public Node(String name, int time) {
		this.name = name;
		this.time = time;
	}
}

public class Main{
	
	public static void main(String[] args) {
		Queue<Node> q = new LinkedList<>();
		Queue<String> result = new LinkedList<>();
		Scanner in = new Scanner(System.in);
		int processes = in.nextInt();
		int quantum = in.nextInt();
		
		for(int i = 0; i < processes; i++) {
			q.add(new Node(in.next(), in.nextInt()));
		}
		
		int timer = 0;
		while(!(q.isEmpty())) {
			Node task = q.remove();
			if(task.time <= quantum) {
				timer = timer + task.time;
				System.out.println(task.name + " " + Integer.toString(timer));
			}
			else {
				task.time = task.time - quantum;
				q.add(task);
				timer = timer + quantum;
			}
			
			
		}
			
	}
		
}
	
