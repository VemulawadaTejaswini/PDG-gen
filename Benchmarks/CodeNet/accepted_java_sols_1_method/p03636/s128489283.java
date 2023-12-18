import java.util.*;
public class Main {
	public static void main(String[] args) {
		int ll = 0;
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String[] str = S.split("");
		ll = str.length - 2;
		System.out.println(str[0] + ll +str[str.length - 1]);
		scan.close();
	}

}