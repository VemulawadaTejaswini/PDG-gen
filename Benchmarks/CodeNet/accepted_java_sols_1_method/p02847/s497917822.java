import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s=scan.nextLine();
		if(s.contains("SAT")) System.out.println("1");
		else if (s.contains("MON"))System.out.println("6");
		else if (s.contains("TUE")) System.out.println("5");
		else if (s.contains("WED")) System.out.println("4");
		else if (s.contains("THU")) System.out.println("3");
		else if (s.contains("FRI")) System.out.println("2");
		else System.out.println("7");
	}

}
