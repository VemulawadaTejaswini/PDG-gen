import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		scan.close();

		char[] c =s.toCharArray();

		int check=0;

		for(int i=0;i<s.length();i++) {
			if(i%2==0&&c[i]=='L'||i%2==1&&c[i]=='R') {
				check=1;
				break;
			}
		}
		if(check==1)System.out.println("No");
		else System.out.println("Yes");
	}

}