import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] inArray = in.split(" ");
		int n1 = Integer.parseInt(inArray[0]);
		int n2 = Integer.parseInt(inArray[1]);
		int n3 = Integer.parseInt(inArray[2]);

		int na = Math.abs(n2 - n1);
		int nb = Math.abs(n3 - n1);
		if (na < nb) {
			System.out.println("A");
		} else {
			System.out.println("B");

		}
	}


}