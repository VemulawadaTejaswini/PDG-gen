
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();


		if(str1.equals("a") || str1.equals("i") ||str1.equals("o") ||str1.equals("u") ||str1.equals("e"))
			System.out.println("vowel");
		else
			System.out.println("consonant");

	}
}
