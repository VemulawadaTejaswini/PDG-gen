import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String st1 = "ABC";
		String st2 = "ARC";

		if(s.equals(st1)) {
			System.out.println("ARC");
		}else if(s.equals(st2)){
			System.out.println("ABC");
		}
	}
}
