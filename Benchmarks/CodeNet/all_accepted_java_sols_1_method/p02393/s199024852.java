import java.util.*;
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), t;
		if(a > b) { t = a; a = b; b = t; }
		if(a > c) { t = a; a = c; c = t; }
		if(b > c) { t = b; b = c; c = t; }
		System.out.println(a + " " + b + " " + c);
	}
}