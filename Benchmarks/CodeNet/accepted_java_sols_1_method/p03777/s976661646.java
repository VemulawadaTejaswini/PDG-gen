
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a, b;
		
		a = sc.next();
		b = sc.next();
		
		if(a.equals("H"))
			System.out.println(b);
		else {
			if(b.equals("H"))
			System.out.println(a);
			else
				System.out.println("H");
		}	
		sc.close();
	}

}
