import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String o = sc.next();
		String e = sc.next();
		if(o.length()==e.length()) {
			for(int i = 0; i<o.length(); i++) {
				System.out.print(o.charAt(i));
				System.out.print(e.charAt(i));
			}
		}
		else {
			for(int i = 0; i < o.length(); i++) {
				if(i == o.length()-1) {
					System.out.print(o.charAt(i));
				}
				else {
				System.out.print(o.charAt(i));
				System.out.print(e.charAt(i));
				}
			}
		}
	}
}