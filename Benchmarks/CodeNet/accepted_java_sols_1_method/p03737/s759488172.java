import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		sc.close();

		String one = s1.substring(0,1).toUpperCase();
		String two = s2.substring(0,1).toUpperCase();
		String three = s3.substring(0,1).toUpperCase();
		System.out.println(one + two + three);
	}
}