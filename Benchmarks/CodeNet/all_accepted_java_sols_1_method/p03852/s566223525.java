import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String c = sc.next();

		String[] boin = {"a","e","i","o","u"};

		if(Arrays.asList(boin).contains(c) ) {
			System.out.println("vowel");
		}else{
			System.out.println("consonant");
		}

	}
}