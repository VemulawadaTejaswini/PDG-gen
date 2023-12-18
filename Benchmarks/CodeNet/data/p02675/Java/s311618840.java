import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			String n = sc.next();
			
			if ( n.endsWith("2") ||	n.endsWith("4") || n.endsWith("5") ||
					n.endsWith("7") || n.endsWith("9") ) {
				System.out.println("hon");
			}
			else if (n.endsWith("0") ||	n.endsWith("1") || n.endsWith("6") || n.endsWith("8")) {
				System.out.println("pon");
				
			}
			else {
				System.out.println("bon");
			}
				
		}
	}

}