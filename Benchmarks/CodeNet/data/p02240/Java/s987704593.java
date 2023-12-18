
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int[] n = new int[b];
		int[] m = new int[b];
		

		for (int i = 0; i < m.length; i++) {
			n[i] = scan.nextInt();
			m[i] = scan.nextInt();
		}
		
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int[] nsend = Arrays.copyOf(n, n.length);
			int[] msend = Arrays.copyOf(m, m.length);
			int s = scan.nextInt();
			int t = scan.nextInt();
			if(reach(s, nsend, msend, t))
				System.out.println("yes");
			else
				System.out.println("no");

		}
	}
	public static boolean reach(int a, int[] start, int[] finish, int goal) {
		//System.out.println("Looking for " + goal);
		//System.out.println("Current A " + a);
		if(a == goal) {
			return true;
		}
		if(a < 0) {
			return false;
		}
		boolean answer = false;
		for(int i = 0; i < start.length; i++) {
			//System.out.println("Start " + start[i]);
			if(a == start[i] && start[i] > -1) {
				//System.out.println("Found Start " + a);

				int[] newstart = start;
				newstart[i] = -1;
				if(reach(finish[i], newstart, finish, goal)) {
					return true;

				} 
			}

			if(a == finish[i] && finish[i] > -1) {
				//System.out.println("Found end" + a);
				int[] newend = finish;
				newend[i] = -1;
				if(reach(start[i], start, newend, goal)) {
					return true;
				}
			}

		}

		return answer;
	}


}

