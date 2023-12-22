import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		if (s.equals("SUN"))
			System.out.println(7);
		else if (s.equals("SAT"))
			System.out.println(1);
		else if (s.equals("FRI"))
			System.out.println(2);
		else if (s.equals("THU"))
			System.out.println(3);
		else if (s.equals("WED"))
			System.out.println(4);
		else if (s.equals("TUE"))
			System.out.println(5);
		else if (s.equals("MON"))
			System.out.println(6);
	}
}