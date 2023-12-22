
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		String c = s.next();
		String b1=b.charAt(0)+"";
		String c1=c.charAt(0)+"";

		if(a.endsWith(b1)&&b.endsWith(c1)) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}

	}

}