import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		long n = scn.nextLong();
		long a = scn.nextLong();
		long b = scn.nextLong();
		
		long diff = b - a; //
		if (diff % 2 == 0) System.out.println("Alice");
		else System.out.println("Borys");
	}

}
