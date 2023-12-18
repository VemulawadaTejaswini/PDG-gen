import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		try {
			int a = Integer.parseInt(scan.next());
			int b = Integer.parseInt(scan.next());
			System.out.println((a * b) + " " + ((a * 2) + (b * 2)));
		} catch (Exception e) {
			System.exit(0);
		}
	}
}