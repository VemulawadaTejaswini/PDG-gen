import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		int check=0;
		if(s.charAt(0)=='A') {
			for(int i=1;i<s.length();i++) {
				if(s.charAt(i)=='C') {
					if(2<=i&&i<s.length()-1)check+=1;
				}else if(s.charAt(i)<'a') {
					check=-1;
					break;
				}
			}
		}
		if(check==1)System.out.println("AC");
		else System.out.println("WA");
	}
}
