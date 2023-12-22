import java.util.*;
public class Main {
	public static void main(String [] args) {
		
		LinkedList<String> names = new LinkedList<String>();
		LinkedList<Integer> times = new LinkedList<Integer>();
		Scanner in = new Scanner(System.in);
		int numLines = in.nextInt();
		int t = in.nextInt();
		int totalTime = 0;
	
		for(int i = 0; i < numLines; i++) {
			names.add(in.next());
			times.add(in.nextInt());
		}
		
		while(!times.isEmpty()) {
			String name = names.removeFirst();
			int time = times.removeFirst();
			
			if(time <= t) {
				totalTime += time;
				System.out.println(name + " " + totalTime);
			}
			
			else {
				totalTime += t;
				names.addLast(name);
				times.addLast(time - t);
			}
		}
	}
	
}

