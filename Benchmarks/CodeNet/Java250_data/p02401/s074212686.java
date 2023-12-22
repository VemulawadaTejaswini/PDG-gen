import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);
		double x = 0;
		
		while(true) {
	        int a = scan.nextInt();
	        String op = scan.next();
	        int b = scan.nextInt();
	        
			if (op.equals ("?")){
				break;
			}
			else if(op.equals ("+")) {
				x = a+b;
			}
			else if(op.equals ("-")) {
				x = a-b;
			}
			else if(op.equals ("*")) {
				x = a*b;
			}
			else if(op.equals ("/")) {
				double A = a;
				x = A/b;
			}
			System.out.println((int) x);
		}
		
	}

}