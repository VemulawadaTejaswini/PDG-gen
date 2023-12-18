public class XCubic {
	public static void main(String[] args) {
		if (args == null || args.length == 0) {
			System.out.println("At least one argument required.");
			return;
		}

		int value = Integer.parseInt(args[0]);
		
		int result = value * value * value;

		System.out.println(result);
	}
}