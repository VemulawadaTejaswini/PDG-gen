import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		sc.nextLine();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();
		String u = sc.nextLine();
		if(u.equals(s)) {
			a--;
		}
		else {
			b--;
		}
		System.out.print(a+" "+b);
	}
}