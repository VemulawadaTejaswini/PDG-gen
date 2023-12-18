import java.util.*;


public class Main {
	
	int n, r;
	int[][] cut;
	
	int solve() {
		Stack<Integer> cards = new Stack<Integer>();
		for (int i = 1; i <= n; i++) {
			cards.push(i);
		}
		
		for (int i = 0; i < cut.length; i++) {
			Stack<Integer> p, c;
			p = new Stack<Integer>();
			c = new Stack<Integer>();
			for (int j = 0; j < cut[i][0] - 1; j++) p.push(cards.pop());
			for (int j = 0; j < cut[i][1]; j++)     c.push(cards.pop());
			while (!p.isEmpty()) cards.push(p.pop());
			while (!c.isEmpty()) cards.push(c.pop());
		}
		return cards.lastElement();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		String output = "";
		while (sc.hasNext()) {
			n = sc.nextInt();
			r = sc.nextInt();
			if (n == 0 && r == 0) {
				break;
			} else {
				cut = new int[r][];
				for (int i = 0; i < r; i++) {
					cut[i] = new int[]{sc.nextInt(), sc.nextInt()};
				}
				output += solve() + "\n";
			}
		}
		sc.close();
		System.out.print(output);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}