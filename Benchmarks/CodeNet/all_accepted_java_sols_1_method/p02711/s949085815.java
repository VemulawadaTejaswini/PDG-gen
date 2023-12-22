import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		String s=stdIn.next();
		char l='7';
		if(s.charAt(0)==l||s.charAt(1)==l||s.charAt(2)==l) {
			System.out.println("Yes");
		}
		else
			System.out.println("No");

	}

}
