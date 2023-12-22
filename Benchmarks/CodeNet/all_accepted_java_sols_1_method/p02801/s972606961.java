import java.util.*;

 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String C = sc.next();
		int charValue = C.charAt(0);
		String next = String.valueOf((char)(charValue + 1));
		System.out.println(next);

	}
}