import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(s.substring(0,5) + " " + s.substring(6, 13) +" " + s.substring(14, 19));
		
		scan.close();

	}

}
