import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Queue<Character> result = new LinkedList<Character>();
		try (Scanner sc = new Scanner (System.in)){
			while (true) {
				int m = sc.nextInt();
				int f = sc.nextInt();
				int r = sc.nextInt();

				if ((m == -1) && (f == -1) && (r == -1)) break;

				char a = Judge(m,f,r);
				result.add(a);
			}
			int a = result.size();
			for (int i = 0; i < a; i++)  {
				System.out.println(result.remove());
			}
		}
	}

	static char Judge(int m,int f,int r) {
		if (m == -1) return 'F';
		else if (f == -1) return 'F';
		else if (m + f >= 80) return 'A';
		else if (m + f >= 65) return 'B';
		else if (m + f >= 50) return 'C';
		else if (m + f >= 30) {
			if (r >= 50) return 'C';
			else return 'D';
		}
		return 'F';
	}

}
