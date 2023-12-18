class Main {
	public static void main(String[] a) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum;
		String str[];
		while (!br.ready()) {
			try {
				str = br.readLine().split(" ");
				sum = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
				System.out.println(Integer.toString(sum).length());
			} catch (NumberFormatException e) {
				System.exit(0);
			}
		}
	}
}