public class Main {
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String[] a) {
		String input;
		while (!(input = scan.nextLine()).equals("")) {
			String[] str = input.split(" ");
			Long x = Long.parseLong(str[0]);
			Long y = Long.parseLong(str[1]);
			print(((Long)(x + y)).toString().length());
		}
	}
	
	public static void print(Object out) {
		System.out.println(out);
	}
}