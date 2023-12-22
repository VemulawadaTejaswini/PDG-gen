import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String total = scanner.nextLine();
		if (total.contains("A") && total.contains("B")) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}	
	
	

}