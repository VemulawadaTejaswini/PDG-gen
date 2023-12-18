import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s =scan.next();
		scan.close();
		int check=1;
		for(int i=1;i<s.length();i++) {
			char c=s.charAt(i-1);
			if(s.charAt(i)==c) {
				check=0;
				break;
			}
		}
		if(check==1)System.out.println("Good");
		else System.out.println("Bad");
	}
}