import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a) {System.out.println("Yes");}
			else {System.out.println("No");}
		}
	}
}
