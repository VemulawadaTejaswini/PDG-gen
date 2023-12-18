import java.util.Scanner;

public class Test {
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in).useDelimiter("\\r\\n");
		String s = stdIn.next();
		s = s.toUpperCase();
		System.out.println(s);
	}
}