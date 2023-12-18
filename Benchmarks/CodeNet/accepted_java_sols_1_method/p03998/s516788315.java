import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		String next = "a";
		while(true) {
			if(next.equals("a") && a.length()>0) {
				next = a.substring(0, 1);
				a = a.substring(1);
			} else if(next.equals("b") && b.length()>0) {
				next = b.substring(0, 1);
				b = b.substring(1);
			} else if(c.length()>0){
				next = c.substring(0, 1);
				c = c.substring(1);
			} else {
				break;
			}
		}
		System.out.println(next.toUpperCase());
	}

}