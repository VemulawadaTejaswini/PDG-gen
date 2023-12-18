import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String o = sc.next();
		String e = sc.next();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < e.length(); i++) {
			sb.append(o.charAt(i));
			sb.append(e.charAt(i));
		}
		if(o.length()>e.length())sb.append(o.charAt(o.length()-1));
		System.out.println(new String(sb));
		sc.close();
	}
}