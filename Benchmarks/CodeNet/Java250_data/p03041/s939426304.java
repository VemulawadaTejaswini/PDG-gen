import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		String c = scan.next();
		String ans;
		ans = c.substring(0,b-1)+c.substring(b-1,b).toLowerCase()+c.substring(b);
		System.out.println(ans);
	}
}