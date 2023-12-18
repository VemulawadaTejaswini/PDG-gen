import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(sc.next());
		String st = sb.reverse().toString();
		System.out.println(sc.next().equals(st) ? "YES" : "NO");
	}
}