

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

// queue
public class Main {

	
	static class Process{
		String name;
		int time;
		public Process(String name, int time) {
			this.name = name;
			this.time = time;
		}
		public String toString(){
			return name + " " + time;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int T = scan.nextInt();
		int totalTime = 0;
	
		Queue<Process> queue = new ArrayDeque<Process>();
		ArrayList<Process> output = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			String name = scan.next();
			int time = scan.nextInt();
			Process process = new Process(name, time);
			queue.offer(process);
		}
		while(true){
            Process process = queue.poll();
            if (process == null) break;
            if (T < process.time) {
				totalTime += T;
				process.time -= T;
				queue.offer(process);
			}else{
				totalTime += process.time;
				output.add(new Process(process.name, totalTime));
			}
        }
		
		for (int i = 0; i < output.size(); i++) {
			System.out.println(output.get(i));
		}
		
		scan.close();
	}

}