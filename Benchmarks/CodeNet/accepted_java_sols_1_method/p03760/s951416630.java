import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String o = scan.next();
		String e = scan.next();
		scan.close();

		for(int i=0;i<e.length();i++) {
			System.out.print(o.charAt(i)+""+e.charAt(i));
		}
		System.out.println((o.length()==e.length())? "":o.charAt(o.length()-1));
	}
}