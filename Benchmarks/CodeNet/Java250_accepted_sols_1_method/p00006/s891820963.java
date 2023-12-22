import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(new StringBuilder(scan.next()).reverse().toString());
	}
}