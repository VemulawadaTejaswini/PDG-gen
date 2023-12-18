import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner scan = new Scanner(System.in);
		int x = 0;
		
		while(true) {
	        int a = scan.nextInt();
	        String op = scan.next();
	        int b = scan.nextInt();
	        
			if (op.equals ("?")){
				break;
			}
			else if(op.equals ("+")) {
				x = a+b;
				System.out.println(x);
			}
			else if(op.equals ("-")) {
				x = a-b;
				System.out.println(x);
			}
			else if(op.equals ("*")) {
				x = a*b;
				System.out.println(x);
			}
			else if(op.equals ("/")) {
				double A = a;
				double y = A/b;
				System.out.println((int) y);
			}
		}
		
	}

}