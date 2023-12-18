import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			String s = sc.next();
			
			boolean nearCoffee = s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5);
			
			System.out.println(nearCoffee ? "Yes" : "No");
		}
	}

}