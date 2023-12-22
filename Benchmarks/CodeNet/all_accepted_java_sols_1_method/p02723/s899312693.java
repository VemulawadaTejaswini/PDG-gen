import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String k = "No";
		String i = kb.next();
		if ((i.charAt(2) == i.charAt(3)) && (i.charAt(4) == i.charAt(5)))
			k = "Yes";
		System.out.println(k);
		kb.close();
	}

}
