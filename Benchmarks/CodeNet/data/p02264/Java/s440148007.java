
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		String[] baseInput = scin.nextLine().split(" ");
		
		int numberOfProcesses = Integer.parseInt(baseInput[0]);
		int timeSlotLength = Integer.parseInt(baseInput[1]);
		
		Queue<String> queue = new LinkedList<>();
		
		for (int i = 0; i < numberOfProcesses; i++) {
			queue.add(scin.nextLine());
		}
		
		//now run it
		Queue<String> finished = new LinkedList<>();
		int totalElapsedTime = 0;
		
		while (queue.isEmpty() == false) {
			String[] rawParts = queue.remove().split(" ");
			int durrationLeft = Integer.parseInt(rawParts[1]);
			String name = rawParts[0];
			
			if (durrationLeft <= timeSlotLength) {
				finished.add(name + " " +(totalElapsedTime + durrationLeft));
				totalElapsedTime += durrationLeft;
			}else {
				durrationLeft -= timeSlotLength;
				
				totalElapsedTime += timeSlotLength;
				
				queue.add(name + " " +durrationLeft);
			}
		}
		
		while (finished.isEmpty() == false) {
			System.out.println(finished.remove());
		}
	}
}

