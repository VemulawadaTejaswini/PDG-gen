import java.util.Scanner;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int nProcesses = input.nextInt();
		int quantum = input.nextInt();
		input.nextLine(); // Clear \n.
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		String[] processes = new String[nProcesses];
		int[] times = new int[nProcesses];
		
		for (int i = 0; i < nProcesses; i++) {
			processes[i] = input.next();
			times[i] = input.nextInt();
			queue.add(i); // Add process to queue.
			input.nextLine(); // Clear \n.
		}

		int elapsedTime = 0;
		while (!queue.isEmpty()) {
			int processID = queue.removeFirst();
			int timeSpent = Math.min(times[processID], quantum);
			times[processID] -= timeSpent;
			elapsedTime += timeSpent;
			
			if (times[processID] == 0) {
				System.out.println(processes[processID] + " " + elapsedTime);
			} else {
				queue.addLast(processID);
			}
		}
		
	}	
}

