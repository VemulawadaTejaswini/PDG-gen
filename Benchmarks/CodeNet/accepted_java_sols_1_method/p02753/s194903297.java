import java.util.Scanner;

public class Main {

	public static int a = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String row = scan.next();
		if((row.equalsIgnoreCase("aaa"))||(row.equalsIgnoreCase("bbb"))) {
		    System.out.println("No");
		}
		else {
		    System.out.println("Yes");
		}
	}

}
