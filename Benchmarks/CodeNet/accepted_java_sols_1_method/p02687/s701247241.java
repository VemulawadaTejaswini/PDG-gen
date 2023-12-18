import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String s = kb.next();
		if (s.equals("ABC"))
			System.out.println("ARC");
		else
			System.out.println("ABC");
		kb.close();
	}

}
