import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		scan.close();
		char[] ac=a.toCharArray();
		char[] bc=b.toCharArray();
		char[] cc=c.toCharArray();
		if(ac[ac.length-1]==bc[0] &&
				bc[bc.length-1]==cc[0])System.out.println("YES");
		else System.out.println("NO");
	}
}