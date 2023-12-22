import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(s.substring(0,1).equals(s.substring(2,3))) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}