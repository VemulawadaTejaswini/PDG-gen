import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int quantum = in.nextInt();
		
		Queue<String> names = new LinkedList<String>();
		Queue<Integer> times = new LinkedList<Integer>();
		
		for(int i = 0; i < num; i++) {
			names.add(in.next());
			times.add(in.nextInt());
		}
		
		int totTime = 0;
		Queue<String> resultNames = new LinkedList<String>();
		Queue<Integer> resultTimes = new LinkedList<Integer>();
		
		while(!names.isEmpty()) {
			
			int tempTime = times.remove();
			
			if(tempTime <= quantum) {
				
				totTime += tempTime;
				resultNames.add(names.remove());
				resultTimes.add(totTime);
				
			} else {
				
				totTime += quantum;
				names.add(names.remove());
				times.add(tempTime - quantum);
				
			}
		}
		
		for(int i = 0; i < num; i++) {
			
			System.out.println(resultNames.remove() + " " + resultTimes.remove());
			
		}
		
		in.close();
		
	}

}

