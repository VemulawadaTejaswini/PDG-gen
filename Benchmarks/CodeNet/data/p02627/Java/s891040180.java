import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a = sc.next();

		String aUpper = a.toUpperCase();

		if (a.equals(aUpper)){
			System.out.println("A");
		} else {
			System.out.println("a");
		}
	}

}