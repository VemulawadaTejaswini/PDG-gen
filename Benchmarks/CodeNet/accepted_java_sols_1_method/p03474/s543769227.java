import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String s = scan.next();
		String message = "No";
		try {
			Integer.parseInt(s.substring(0, a));
			Integer.parseInt(s.substring(a + 1));
			if(s.length() - a == b + 1) {
				if(s.charAt(a) == '-') {
					message = "Yes";
				} 
			}
		} catch(NumberFormatException e){
		}
		System.out.println(message);
	}
}