import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	
	private static class Process{
		public String n;
		public int t;
		
		public Process(String name, int time) {
			n = name;
			t = time;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String first = in.nextLine();
		String[] components = first.split(" ");
		int inputs = Integer.parseInt(components[0]);
		int quantum = Integer.parseInt(components[1]);
		int time = 0;
		
		//Creating the Queue of processes
		LinkedList<Process> q = new LinkedList<>();
		while (in.hasNextLine()) {
			String i = in.nextLine();
			String[] c = i.split(" ");
			q.add(new Process(c[0], Integer.parseInt(c[1])));
		}
		
		//Running
		while (!q.isEmpty()) {
			Process curr = q.poll();
			if (curr.t <= quantum) {
				time += curr.t;
				System.out.println(curr.n + " " + time);
			} else {
				curr.t -= quantum;
				time += quantum;
				q.add(curr);
			}
		}
	}
}
