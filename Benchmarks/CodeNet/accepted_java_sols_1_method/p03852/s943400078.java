
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String p[] = {"a", "e", "i", "o", "u"};
		
		String c;
		boolean vowel = false;
		
		c = sc.nextLine();
		for(int i = 0; i < p.length; ++i) {
			if(c.equals(p[i])) {
				vowel = true;
				break;
			}
		}
		
		if(vowel)System.out.println("vowel");
		else System.out.println("consonant");
		
		sc.close();
	}

}
