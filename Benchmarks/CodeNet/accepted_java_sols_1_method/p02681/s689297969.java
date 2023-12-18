import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		String s2 = sc.next();

		int length = s1.length();
		String s3 = s2.substring(0, length);

		//System.out.println(s3);

		if(s1.equals(s3)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}

}
