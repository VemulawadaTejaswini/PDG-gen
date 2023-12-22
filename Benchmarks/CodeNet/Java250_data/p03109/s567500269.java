import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		String s [] = S.split("/");
		
		
		if (s[0].equals("2019")!=true)
			System.out.println("Heisei");
		
		else {
			if (s[1].equals("01") || s[1].equals("02") || s[1].equals("03") || s[1].equals("04"))
				System.out.println("Heisei");
			else
				System.out.println("TBD");
		}
		sc.close();

	}

}
