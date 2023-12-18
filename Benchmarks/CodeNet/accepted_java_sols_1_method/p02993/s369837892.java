import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str.charAt(0) == str.charAt(1) || 
				str.charAt(1) == str.charAt(2) || 
				str.charAt(2) == str.charAt(3) ? "Bad" : "Good");
	}
}