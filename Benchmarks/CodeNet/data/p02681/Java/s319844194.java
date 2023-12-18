import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String ID = scanner.next();
		String newID = scanner.next();
		
		scanner.close();
		
		if (ID.equals(newID.substring(0, newID.length() - 1))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
