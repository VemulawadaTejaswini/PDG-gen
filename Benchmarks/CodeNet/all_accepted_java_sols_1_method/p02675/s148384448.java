import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		
		if(n.length() == 1) {
			if(n.equals("3")) {
				System.out.println("bon");
			} else if(n.equals("0") || n.equals("1")||n.equals("6")||n.equals("8")) {
				System.out.println("pon");
			} else {
				System.out.println("hon");
			}	
		}
		
		if(n.length() == 2) {
			String num = n.substring(1);
			if(num.equals("3")) {
				System.out.println("bon");
			} else if(num.equals("0") || num.equals("1")||num.equals("6")||num.equals("8")) {
				System.out.println("pon");
			} else {
				System.out.println("hon");
			}	
		}
		
		if(n.length() == 3) {
			String num = n.substring(2);
			if(num.equals("3")) {
				System.out.println("bon");
			} else if(num.equals("0") || num.equals("1")||num.equals("6")||num.equals("8")) {
				System.out.println("pon");
			} else {
				System.out.println("hon");
			}	
		}

	}
}
