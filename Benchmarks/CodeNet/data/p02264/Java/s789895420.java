import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int numberOfProcesses;
		int quantum;
		int clock = 0;
		String line;
		
		Queue<String> taskQueue = new LinkedList<String>();
		Queue<Integer> timeQueue = new LinkedList<Integer>();
		
		Scanner keyboard = new Scanner(System.in);
		Scanner input;
		
		line = keyboard.nextLine();
		
		input = new Scanner(line);
		
		numberOfProcesses = Integer.parseInt(input.next());
		quantum = Integer.parseInt(input.next());
		
		for(int i = 0; i < numberOfProcesses; i++) {
			line = keyboard.nextLine();
			input = new Scanner(line);
			
			taskQueue.add(input.next());
			timeQueue.add(Integer.parseInt(input.next()));
		}
		
		while(!taskQueue.isEmpty()) {
			
			String currentTask = taskQueue.remove();
			int currentTime = timeQueue.remove();
			
			if(currentTime > quantum) {
				currentTime = currentTime - quantum;
				
				taskQueue.add(currentTask);
				timeQueue.add(currentTime);
				
				clock = clock + quantum;
			}
			else {
				
				clock = clock + currentTime;
				
				System.out.print(currentTask + " ");
				System.out.println(clock);
			}
		}
		
		
		
	}

}
