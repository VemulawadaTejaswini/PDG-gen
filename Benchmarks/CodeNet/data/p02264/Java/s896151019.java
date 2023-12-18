import java.util.Scanner;
import java.util.LinkedList; 
import java.util.Queue; 

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ts = 0;
		
		Queue<Integer> qN = new LinkedList<>(); 
		Queue<String> qP = new LinkedList<>(); 
		
		String line = sc.nextLine();
		
		String[] lineList = line.split(" ");
		String[] itemsList = new String[Integer.parseInt(lineList[0])*2];
		
		int q = Integer.parseInt(lineList[1]);
		
		String[] items = new String[Integer.parseInt(lineList[0])];
		
		//add everything into queues
		for(int i = 0; i < Integer.parseInt(lineList[0]); i++) {
			items[i] = sc.nextLine();
			itemsList = items[i].split(" ");
			qP.add(itemsList[0]);
			qN.add(Integer.parseInt(itemsList[1]));
		}
		
		while(!qP.isEmpty()){
			if(q - qN.peek() < 0) {
				qN.add(-1*(q-qN.remove()));
				qP.add(qP.remove());
				ts += q;
			}
			else {
				ts += qN.remove();
				System.out.println(qP.remove() + " " + ts);
			}
		}
		
	}
}

