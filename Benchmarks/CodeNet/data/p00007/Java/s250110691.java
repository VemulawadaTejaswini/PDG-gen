public class Main {
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	public static void main(String[] args) {
		int input = scan.nextInt();
		double total = 100;
		while (0 < input--) {
			total = Math.ceil(total * 1.05);
		}
		total *= 1000;
		print((int) total);
	}
	
	public static void print(Object out) {
		System.out.println(out);
	}
}