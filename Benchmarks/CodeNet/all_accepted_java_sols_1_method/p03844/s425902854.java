import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {

	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	String op = sc.next();
	int b = sc.nextInt();
	
		if(op.equals("+")) {
			System.out.println(a + b);
		} else if(op.equals("-")) {
				System.out.println(a - b);
		} else {
			throw new Exception("Error");
		}
	}
}