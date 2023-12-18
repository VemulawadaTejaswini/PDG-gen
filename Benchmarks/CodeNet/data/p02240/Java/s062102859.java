

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int[] n = new int[b];
		int[] m = new int[b];
		LinkedList<LinkedList<Integer>> visited = new LinkedList<>();
		while(visited.size() <= b) {
			visited.add(new LinkedList<>());
		}
		for (int i = 0; i < m.length; i++) {
			n[i] = scan.nextInt();
			m[i] = scan.nextInt();
		}

		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int s = scan.nextInt();
			int t = scan.nextInt();
			if(reach(s, n, m, t, visited))
				System.out.println("yes");
			else
				System.out.println("no");

		}
	}
	public static boolean reach(int a, int[] start, int[] finish, int goal, LinkedList<LinkedList<Integer>> repition) {
		if(a == goal) {
			return true;
		}
		for(int i = 0; i < repition.size(); i++) {
			if(repition.get(i).size() > start.length)
				continue;
			
		}
		boolean answer = false;
		for(int i = 0; i < start.length; i++) {

				if(a == start[i] && start[i] > -1) {
					//System.out.println("Found Start" + a);
					start[i] = -1;
					repition.get(i).add(1);
					if(reach(finish[i], start, finish, goal, repition)) {
						return true;
						
					} 
				}
			
				if(a == finish[i] && finish[i] > -1) {
					//System.out.println("Found end" + a);
					finish[i] = -1;
					repition.get(i).add(1);
					if(reach(start[i], start, finish, goal, repition)) {
						return true;
					}
				}
			
		}

		return answer;
	}
		

}

