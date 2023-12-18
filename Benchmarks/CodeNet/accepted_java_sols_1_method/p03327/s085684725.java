import java.util.*;
import java.math.*;
public class Main {
	static int x;
	static int ans;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		System.out.println(n <= 999? "ABC" : "ABD");
	}
} 