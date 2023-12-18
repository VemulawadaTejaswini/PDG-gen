import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String c = scan.nextLine();
		if(c.substring(0,1).equals("a") || c.substring(0,1).equals("i") || c.substring(0,1).equals("u") || c.substring(0,1).equals("e")  || c.substring(0,1).equals("o")) {
			System.out.println("vowel");
		} else {
			System.out.println("consonant");
		}
		scan.close();

	}

}
