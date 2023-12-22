import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String[] info = sc.nextLine().split(" ");
		Queue<Process> entries = new LinkedList<>();
		int size = Integer.parseInt(info[0]);
		int runtime = Integer.parseInt(info[1]);
		for(int i = 0; i < size; i++) {
			info = sc.nextLine().split(" ");
			entries.add(new Process(info[0], Integer.parseInt(info[1])));
		}
		sc.close();
		int totalTime = 0;
		while(entries.size() > 0) {
			Process temp = entries.remove();
			if(temp.getTime() > runtime) {
				totalTime += runtime;
				temp.setTime(temp.getTime() - runtime);
				entries.add(temp);
			}
			else {
				totalTime += temp.getTime();
				System.out.println(temp.getName() + " " + totalTime);
			}
		}
	}
}

class Process{
	String name;
	int time;
	
	public Process(String n, int t) {
		this.name = n;
		this.time = t;
	}
	
	public int getTime() {
		return this.time; 
	}
	
	public void setTime(int t) {
		this.time = t;
	}
	
	public String getName() {
		return this.name;
	}
}

