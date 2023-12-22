import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = new String(in.nextLine());
		boolean f1=huiwen(s);
		boolean f2=huiwen(s.substring(0, (s.length()-1)/2));
		boolean f3=huiwen(s.substring((s.length()+3)/2-1, s.length()));
		if(f1&&f2&&f3) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	public static boolean huiwen(String ss) {
		StringBuffer a = new StringBuffer(ss);
		String s1 = a.toString();
		String s2 = a.reverse().toString();
		return s1.equals(s2);
	}
}