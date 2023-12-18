public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.exit(1);
		}
		int input = Integer.parseInt(args[0]);
		int result = (int) Math.pow(input, 3);
		System.out.println(result);
	}

}