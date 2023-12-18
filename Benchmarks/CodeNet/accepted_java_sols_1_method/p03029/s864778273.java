import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt(sc.next());
		int p = Integer.parseInt(sc.next());
		int sum  = 3*a + p;
		int pie = sum/2;
		System.out.println(pie);
	}
}