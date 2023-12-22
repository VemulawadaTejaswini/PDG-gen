import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String n = sc.next();
		String[] nArray = n.split("");
		long sum = 0;
		for (String nChar : nArray) {
			sum += Integer.parseInt(nChar);
		}
		
		if (0 == (sum%9)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
  		
		
	}



}
