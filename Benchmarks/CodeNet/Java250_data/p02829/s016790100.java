import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		String i = kb.next();
		String j = kb.next();
		kb.close();
		String k = "123".replace(i, "");
		 k = k.replace(j, "");
		 System.out.println(k);
	}

}
