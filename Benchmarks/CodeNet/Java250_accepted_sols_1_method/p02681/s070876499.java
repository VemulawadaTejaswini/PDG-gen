import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		if(s1.equals(s2.substring(0,s2.length()-1))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}