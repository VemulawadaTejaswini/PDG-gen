import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String α = in.next();
		if(Character.isUpperCase(α.charAt(0))) {
			System.out.println(α.toLowerCase());
		}else {
			System.out.println(α.toUpperCase());
		}
	}
}