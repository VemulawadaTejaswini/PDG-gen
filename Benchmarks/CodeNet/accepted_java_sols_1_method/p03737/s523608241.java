import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next().toUpperCase();
		String s2 = sc.next().toUpperCase();
		String s3 = sc.next().toUpperCase();
		System.out.println(s1.split("")[0] + s2.split("")[0] + s3.split("")[0]);
		sc.close();
	}
}