import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		String b = a.substring(a.length() - 1);

		if(b.equals("3")) {
			System.out.println("bon");
		}else if(b.equals("0") || b.equals("1") || b.equals("6") || b.equals("8")) {
			System.out.println("pon");
		}else {
			System.out.println("hon");
		}

	}
}