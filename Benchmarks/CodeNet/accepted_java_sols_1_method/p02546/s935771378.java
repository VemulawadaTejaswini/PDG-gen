import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String last = s.substring(s.length() - 1);
		
		if (!last.equals("s")) {
		  System.out.println(s + "s");
		} else {
		  System.out.println(s + "es");
		}
	}
}