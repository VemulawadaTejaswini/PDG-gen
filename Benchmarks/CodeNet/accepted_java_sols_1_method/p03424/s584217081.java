import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		sc.nextLine();
		String s = sc.nextLine();
		boolean haveFour = s.contains("Y");
		System.out.println(haveFour ? "Four" : "Three");
		sc.close();
	}

}
