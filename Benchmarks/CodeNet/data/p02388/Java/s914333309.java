import java.lang.*;
import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		int x;
		
		try {
			x = Integer.parseInt(input);
			
			if (!(x >= 1 && x <= 100)) {
				throw new IllegalArgumentException();
			}
			
			System.out.println((int)Math.pow(x, 3));
		
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}