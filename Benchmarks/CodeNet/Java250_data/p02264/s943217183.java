
import java.util.AbstractMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

// the simulation of the round robin scheduler
public class Main {
	// log in the order of termination
	public static void simulate(Queue<Map.Entry<String, Integer>> budgets, int q) {
		int global_timer = 0;

		
		Map.Entry<String, Integer> budget;
		int time_consumpt;
		
		while(!budgets.isEmpty()) {
				budget = budgets.poll();
				time_consumpt = Math.min(budget.getValue(), q);
				budget.setValue(budget.getValue() - time_consumpt);
				global_timer += time_consumpt;
				if(budget.getValue() == 0) {
					System.out.println(budget.getKey() +" "+global_timer);
				}else {
					budgets.add(budget);
				}
		}


		return;
		
	}
	
	
	
	
	public static void main(String [] args) {
		Scanner cin = new Scanner(System.in);
		int len = cin.nextInt();
		int q = cin.nextInt();


		Queue<Map.Entry<String, Integer>> budgets = new LinkedList<Map.Entry<String, Integer>>() ;
		
		for(int i = 0; i < len; i++) {
			budgets.add(new AbstractMap.SimpleEntry<String, Integer>(cin.next(), cin.nextInt()));
		}
		cin.close();
		
		simulate(budgets, q);
		

		
	}
}