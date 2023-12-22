import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String n = scanner.next();
		
		scanner.close();
		
		String X = null;
		
		if (n.length() == 1) {
			X = n;
		} else if (n.length() == 2) {
			X = n.substring(1,2);
		} else {
			X = n.substring(2,3);
		}
		
		if (X.equals("3")) {
			System.out.println("bon");
		} else if (X.equals("0") || X.equals("1") || X.equals("6") || X.equals("8")) {
			System.out.println("pon");
		} else {
			System.out.println("hon");
		}
	}

}
