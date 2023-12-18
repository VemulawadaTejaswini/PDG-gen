public class Main {
	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	private void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		reader.close();
		int sum = 0;
		Stack<Integer> st1 = new Stack<Integer>();
		Stack<int[]> st2 = new Stack<int[]>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (c == '\\') {
				st1.add(i);
			} else if (c == '/' && !st1.isEmpty()) {
				int j = st1.pop();
				int area = i - j;
				sum += area;
				int prev = 0;
				while (!st2.isEmpty() && st2.peek()[0] > j) {
					prev += st2.pop()[1];
				}
				st2.add(new int[]{j, area + prev});
			}
		}
		
		System.out.println(sum);
		System.out.print(st2.size());
		for (int i = 0; i < st2.size(); i++) {
			System.out.print(" " + st2.get(i)[1]);
		}
		System.out.println();
	}
}
