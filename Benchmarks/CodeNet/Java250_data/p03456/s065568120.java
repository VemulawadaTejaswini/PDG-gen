import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			String a = sc.next();
			String b = sc.next();
			
			int ab = Integer.parseInt(a + b);
			int temp = (int)Math.sqrt(ab);
			
			if (Math.pow(temp,2) == ab) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}

}