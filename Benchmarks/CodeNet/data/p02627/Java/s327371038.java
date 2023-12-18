import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String alpha = scan.next();
		
		if(Character.isUpperCase(alpha.charAt(0))) {
			System.out.println("A");
		}else {
			System.out.println("a");
		}

	}

}
