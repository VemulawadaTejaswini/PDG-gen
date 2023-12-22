import java.util.*;
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int a, b, t;
		while(true) {
			a = sc.nextInt(); b = sc.nextInt();
			if(a == 0 && b == 0) break;
			if(a > b) { t = a; a = b; b = t; }
			System.out.println(a + " " + b);
		}
	}
}