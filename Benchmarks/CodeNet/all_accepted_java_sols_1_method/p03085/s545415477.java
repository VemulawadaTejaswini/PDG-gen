import java.util.Scanner;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		String b = sc.next();
		String c = null ;
		switch(b) {
		case "A":
			c = "T";
			break;
		case "C":
			c = "G";
			break;
		case "G":
			c = "C";
			break;
		case "T":
			c = "A";
			break;
		}
		
		System.out.println(c);


	}

}
