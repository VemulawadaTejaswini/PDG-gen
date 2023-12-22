import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int a = s.indexOf("A");
		int z = s.lastIndexOf("Z");
		String r = s.substring(a, z+1);
		int ans = r.length();
		System.out.println(ans);
	}
}
