import java.util.Scanner;
import java.util.Queue;
import java.util.ArrayDeque;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		Scanner setsinput = new Scanner(input);
		int n = setsinput.nextInt();
		int quantum_time = setsinput.nextInt();
		Queue<Process> q = new ArrayDeque<Process>();
		for(int i = 0; i < n; i++) {
			String setsStr = in.nextLine();
			//System.out.println(setsStr.charAt(0));
			Scanner setsLine = new Scanner(setsStr);
			q.add(new Process(setsLine.next(),setsLine.nextInt()));
		}
		
		Process tmp = new Process();
		StringBuilder ans = new StringBuilder();
		int total_time = 0;
		
		while (!q.isEmpty()) {
			tmp = q.peek();
			q.poll();
			if(tmp.get_time() <= quantum_time) {
				total_time += tmp.get_time();
				ans.append(tmp.get_Name()).append(" ").append(Integer.toString(total_time)).append("\n");
			}else {
				total_time += quantum_time;
				q.add(new Process(tmp.get_Name(), tmp.get_time() - quantum_time));
			}
		}
		System.out.print(ans.toString());
	}
}

class Process {
	String name;
	int time;
	
	Process(){
		
	}
	
	Process(String init_name, int init_time){
		name = init_name;
		time = init_time;
	}
	
	public String get_Name() {
		return name;
	}
	
	public int get_time() {
		return time;
	}
	
}

	

