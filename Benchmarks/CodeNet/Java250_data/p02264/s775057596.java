
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	private String name;
	private int q;

	//construct a pair object to keep track of each process's quantum, and a bool to check if it is complete
	public Main(String name, int q) {
		this.name = name;
		this.q = q;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQ() {
		return q;	
	}

	public void setQ(int q) {
		this.q = q;
	}
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Queue<Main> queue = new LinkedList<Main>();
		
		//scan first line to get number of processes and the universal quantum
		String firstLine = in.nextLine();
		Scanner first = new Scanner(firstLine);
		int items = Integer.parseInt(first.next());
		int quantum = Integer.parseInt(first.next());

		//create queue with data from file
		for(int i = 0; i < items; i++) {
			String line = in.nextLine();
			Scanner linereader = new Scanner(line);
			
			String itemName = linereader.next();
			int itemQ = Integer.parseInt(linereader.next());
			
			queue.add(new Main(itemName, itemQ));
		}
		
		int turnCounter = 0;
		while(!queue.isEmpty()) {
			Main next = queue.remove();
			int qCheck = next.getQ() - quantum;
			
			//if item completes
			if(qCheck <= 0) {
				turnCounter+= next.getQ();
				next.setQ(turnCounter);
				System.out.println(next.getName() + " " + next.getQ());
			}
			//else if it has time remaining
			else {
				turnCounter += quantum;
				next.setQ(qCheck);
				queue.add(next);
			}
		}
	}
}

