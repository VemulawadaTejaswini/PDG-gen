import java.util.Scanner;


import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
	public String key;
	public int value;
	public Pair(String name, int number) {
		this.key = name;
		this.value = number;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] info = sc.nextLine().split(" ");
		
		int n = Integer.parseInt(info[0]);
		int limit =Integer.parseInt(info[1]);
		int time = 0;
		
		Queue<Pair> q = new LinkedList<Pair>();
		String [] inputArrayS = new String[n];
		for (int i = 0; i < n; i += 1) {
			inputArrayS[i]  = sc.nextLine();
		}
		sc.close();
		
		for (int j = 0; j < n; j += 1) {
			
			int quantum = Integer.parseInt(inputArrayS[j].split(" ")[1]);
			String nameS = inputArrayS[j].split(" ")[0];
			Pair p = new Pair(nameS, quantum);
			q.offer(p);
			}

			while (q.size()>0) {
				
					if(q.peek().value > limit) {
						Pair cp = q.remove();
						time = time + limit;
						
					
					cp.value = cp.value - limit;
					cp.key = cp.key;	
					q.add(cp);
					
					
				}else{
					
					time = time + q.peek().value;				
					System.out.println(q.peek().key + " " + time);
					q.remove();
					
				}
			}
		}
	}
