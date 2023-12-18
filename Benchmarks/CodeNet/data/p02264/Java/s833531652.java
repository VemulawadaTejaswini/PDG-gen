package alds_1_3_B;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

// the simulation of the round robin scheduler
public class Main {
	// log in the order of termination
	public static void simulate(Queue<Map.Entry<String, Integer>> procs, int q, HashMap<String, Integer> consumption) {
		
		while(!procs.isEmpty()) {
			Map.Entry<String, Integer> victim = procs.remove();

			int time_consumpt = Math.min(q, victim.getValue());
			consumption.replace(victim.getKey(), consumption.get(victim.getKey()) + time_consumpt);
			
		
			//update the non-victim
			Iterator<Map.Entry<String, Integer>> iter = procs.iterator();
			while(iter.hasNext()) {
				Map.Entry<String, Integer> current = iter.next();
				consumption.replace(current.getKey(), consumption.get(current.getKey())+time_consumpt);
			}
			
			victim.setValue(victim.getValue() - time_consumpt);
			if(victim.getValue() == 0) {
				System.out.println(victim.getKey()+" "+consumption.get(victim.getKey()));
				consumption.remove(victim.getKey());
			}else { // put it back to the queue
				procs.add(victim);
			}
			
			
			
		}
		
		return;
		
	}
	
	
	
	
	public static void main(String [] args) {
		Scanner cin = new Scanner(System.in);
		int len = cin.nextInt();
		int q = cin.nextInt();
		
		Queue<Map.Entry<String, Integer>> procs = new LinkedList<Map.Entry<String, Integer>>();
		HashMap<String, Integer> consumption = new HashMap<String, Integer>();
		
		
		
		String k;
		int v;
		while(len > 0) {
			k = cin.next();
			v = cin.nextInt();
			consumption.put(k, 0); // initialize the consumption table
			procs.add(new AbstractMap.SimpleEntry<String, Integer>(k, v));
			len --;
		}
		
		cin.close();
		
		simulate(procs, q, consumption);
		

		
	}
}