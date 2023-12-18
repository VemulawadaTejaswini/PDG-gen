import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();
		char[] n=s.toCharArray();
		int i=0;
		int check=1;
		while(i<=s.length()/2) {
			if(Character.getNumericValue(n[i])!=Character.getNumericValue(n[s.length()-1-i])) {
				check=0;
				break;
			}
			i++;
		}
		if(check==1)System.out.println("Yes");
		else System.out.println("No");
	}
}