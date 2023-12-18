class Main {
	public static void main(String[] args) throws Exception {

		Integer[] mountains = new Integer[args.length];
		for (int i = 0; i < args.length; i++) {
			try {
				mountains[i] = Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				throw new Exception(e);
			}
		}
		Arrays.sort(mountains, Collections.reverseOrder());
		for (int i = 0; i < 3; i++)
			System.out.println(mountains[i]);
	}
}