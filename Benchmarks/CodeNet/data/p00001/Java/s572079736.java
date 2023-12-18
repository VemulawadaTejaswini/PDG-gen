public class Main {
	private static BufferedReader input =
			new BufferedReader (new InputStreamReader (System.in));
	private static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] a) throws IOException {
		Integer num = 0;
		for (int i = 0; i < 10; ++i) {
			try {
				num = Integer.parseInt(input.readLine());
			} catch (NumberFormatException e) {
				System.exit(0);
			}
			if (num < 0 || 10000 < num) {
				System.exit(0);
			}
			list.add(num);
		}
		Collections.sort(list);
		System.out.println(list.get(9) + "\n" + list.get(8) + "\n" + list.get(7));
	}
}