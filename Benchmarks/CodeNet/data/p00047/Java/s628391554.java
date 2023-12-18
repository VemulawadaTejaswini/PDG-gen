import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Deque<String[]> que = new LinkedList<String[]>();
		while(in.hasNext()) que.push(in.nextLine().split(","));
		System.out.println(solve(que));
	}
	static String solve(Deque<String[]> que) {
		String now = "A";
		while(!que.isEmpty()) {
			String[] pair = que.pollLast();
			now = now.equals(pair[0])?pair[1]:now.equals(pair[1])?pair[0]:now;
		}
		return now;
	}
}