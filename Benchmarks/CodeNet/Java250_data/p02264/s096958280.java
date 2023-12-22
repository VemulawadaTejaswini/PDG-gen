

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Queue<ItemPair> list = new LinkedList<ItemPair>();
		Scanner k = new Scanner(System.in);
		
		int processes = k.nextInt();
		int quantum = k.nextInt();
		
		//Fill the queue
		for(int x = 0; x < processes; x++) {
			String inputName = k.next();
			int inputTime = k.nextInt();
			
			ItemPair itemPair = new ItemPair(inputTime, inputName);
			list.add(itemPair);
		}
		
		int timeStart = 0;
		while(!list.isEmpty()) {
			
			ItemPair temp = list.poll();
			
			if(temp.send_time() > quantum) {
				temp.set_time(temp.send_time() - quantum);
				timeStart += quantum;
				list.add(temp);
			} else {
				timeStart += temp.send_time();
				System.out.println(temp.send_name() + " " + timeStart);
			}
		}
		
	}
}

//Each node in the queue will have these properties
class ItemPair {
	String name;
	int time;
	
	public ItemPair(int x, String y) {
		time = x;
		name = y;
	}
	public void set_time(int newTime) {
		this.time = newTime;
	}
	public int send_time() {
		return time;
	}
	public String send_name() {
		return name;
	}
	
	
	
}

