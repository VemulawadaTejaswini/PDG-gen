import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		String str=String.valueOf(n);

		for(int i=0;i<str.length();i++) {
			int x=Character.getNumericValue(str.charAt(i));
			System.out.print((x==1)? "9" : ((x==9)? "1":x));
		}
		System.out.println();
    }
}