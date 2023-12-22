import java.util.*;
class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int a, c = 0;
		while(true) {
			a = sc.nextInt();
			if(a == 0) break;
			System.out.println("Case " + (++c) + ": " + a);
		}
	}
}