import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		if(s.equals(t.substring(0, s.length())) && s.length()+1 == t.length())
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
