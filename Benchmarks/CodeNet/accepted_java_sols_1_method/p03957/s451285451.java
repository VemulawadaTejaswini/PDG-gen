
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// get a string
		String s = sc.next();
	
		if (s.isEmpty()) {
			System.out.println("No");
			return;
		}
		
		if (s.matches("(.*)C(.*)F(.*)")) {
			System.out.println("Yes");
		}else System.out.println("No");
	
	}

}
