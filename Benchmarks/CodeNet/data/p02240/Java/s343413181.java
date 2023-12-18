
import java.util.Scanner;

public class Main{

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
			int s = scan.nextInt();
			int t = scan.nextInt();
			if(reach(s, n, m, t))
				System.out.println("yes");
			else
				System.out.println("no");

		}
	}
	public static boolean reach(int a, int[] start, int[] finish, int goal) {
		if(a == goal) {
			return true;
		}
		boolean answer = false;
		for(int i = 0; i < start.length; i++) {
			if(a == start[i])
				if(reach(finish[i], start, finish, goal))
					answer = reach(finish[i], start, finish, goal);
			if(a == finish[i])
				if(reach(start[i], start, finish, goal))
					answer = reach(finish[i], start, finish, goal);
		}

		return answer;
	}

}

