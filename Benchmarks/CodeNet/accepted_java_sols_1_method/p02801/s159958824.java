import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] w = a.toCharArray();
		System.out.println(++w[0]);
	}
}