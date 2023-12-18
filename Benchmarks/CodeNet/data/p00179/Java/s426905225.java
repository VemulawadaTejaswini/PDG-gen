import java.util.*;
public class Main {
	
	class Node {
		int cost;//秒数
		String state;//現在の状態
		Node(int cost, String state) {
			this.cost = cost;
			this.state = state;
		}
	}
	
	private int solve(String start) {
		int len = start.length();
		char[] work = new char[len];
		for(int r =0; r < work.length; r++) work[r] = 'r';
		String r_goal = new String(work);
		for(int r = 0; r < work.length; r++) work[r] = 'g';
		String g_goal = new String(work);
		for(int r = 0; r < work.length; r++) work[r] = 'b';
		String b_goal = new String(work);
		int color_sum = 'r' + 'g' + 'b';
		Queue<Node> open = new LinkedList<Node>();
		TreeSet<String> closed = new TreeSet<String>();
		open.add(new Node(0, start));
		closed.add(start);
		while(!open.isEmpty()) {
			Node temp = open.poll();
			int cost = temp.cost;
			String state = temp.state;
			if(state.equals(r_goal) || state.equals(g_goal) || state.equals(b_goal)) {
				return(cost);
			}
			for(int r = 1; r < len; r++) {
				if(state.charAt(r) != state.charAt(r - 1)) {
					char color = (char)(color_sum - state.charAt(r) - state.charAt(r - 1));
					StringBuilder nstate_b = new StringBuilder(state);
					nstate_b.setCharAt(r, color);
					nstate_b.setCharAt(r - 1, color);
					String nstate = new String(nstate_b);
					if(!closed.contains(nstate)) {
						open.add(new Node(cost + 1, new String(nstate)));
						closed.add(new String(nstate));
					}
				}
			}
		}
		return(-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		while(true) {
			String worm = stdIn.next();
			if(worm.equals("0")) break;
			int ans = new Main().solve(worm);
			System.out.println((ans != -1) ? ans:"NA");
		}
	}

}