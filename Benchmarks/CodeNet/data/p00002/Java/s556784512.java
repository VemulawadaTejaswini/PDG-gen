public class Main {
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		while (scan.hasNextInt()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			print(String.valueOf(a + b).length());
		}
	}
	
	public static void print(Object out) {
		System.out.println(out);
	}
}