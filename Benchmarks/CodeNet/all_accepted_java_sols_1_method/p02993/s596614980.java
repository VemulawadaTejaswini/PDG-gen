import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				System.out.println("Bad");
				break;
			}
			if(i==s.length()-2) System.out.println("Good");
		}
	}
}