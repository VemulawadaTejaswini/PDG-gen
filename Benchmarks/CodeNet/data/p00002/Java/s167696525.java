public class Main {
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String[] a) {
		String input = scan.nextLine();
		while (!input.equals("")) {
			String[] str = input.split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			print(String.valueOf(x + y).length());
			input = scan.nextLine();
		}
	}
	
	public static void print(Object out) {
		System.out.println(out);
	}
}