import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c1 = s.charAt(0);
		char c2 = s.charAt(1);
		char c3 = s.charAt(2);
		char c4 = s.charAt(3);
		boolean bool =  false;
		if(c1 == c2)
		{
			if(c3 == c4 && c1 != c3)
				bool = true;
		}
		if(c1 == c3) {
			if(c2 == c4 && c1 != c2)
				bool = true;
		}
		if(c1 == c4) {
			if(c2 == c3 && c1 != c2)
				bool = true;
		}
		System.out.println(bool ? "Yes" : "No");
		}
}

