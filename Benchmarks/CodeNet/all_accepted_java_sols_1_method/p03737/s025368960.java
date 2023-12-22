import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		
		String s = String.valueOf(s1.toUpperCase().charAt(0)) + String.valueOf(s2.toUpperCase().charAt(0)) + String.valueOf(s3.toUpperCase().charAt(0));
		
		System.out.println(s);

	}

}