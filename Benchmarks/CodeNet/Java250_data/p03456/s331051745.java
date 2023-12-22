import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String a = stdIn.next();
		String b = stdIn.next();
		String c = new String(a+b);
		int ab = Integer.parseInt(c);
		
		if(Math.sqrt(ab) == (int)Math.sqrt(ab)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
