import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		List<Stack<String>> stack = new ArrayList<Stack<String>>();
		for(int i = 0; i < n; i++) stack.add(new Stack<String>());
		while(true) {
			String l = in.nextLine();
			if("quit".equals(l)) break;
			String[] order = l.split(" ");
			String ord = order[0];
			int p = Integer.parseInt(order[1])-1;
			if("push".equals(ord)) {
				String c = order[2];
				stack.get(p).push(c);
			} else if("pop".equals(ord)) {
				System.out.println(stack.get(p).pop());
			} else if("move".equals(ord)) {
				int x = Integer.parseInt(order[2])-1;
				stack.get(x).push(stack.get(p).pop());
			}
		}
	}
}