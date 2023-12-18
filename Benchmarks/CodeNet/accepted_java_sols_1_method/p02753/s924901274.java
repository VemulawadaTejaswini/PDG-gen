import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String p = kb.next();
		if (p.equals("AAA") || p.equals("BBB"))
			System.out.println("No");
		else
			System.out.println("Yes");
		kb.close();
	}

}
