import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		if((a.equals("H")&&b.equals("H"))||(a.equals("D")&&b.equals("D"))) {
			System.out.println("H");
		}else {
			System.out.println("D");
		}
	}
}