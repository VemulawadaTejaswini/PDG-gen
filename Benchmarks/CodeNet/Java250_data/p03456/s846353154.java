import java.util.*;
import static java.lang.System.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		B(sc);
	}
	
	public static void A(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if((a*b)%2==1) out.println("Odd");
		else out.println("Even");
	}
	
	public static void B(Scanner sc) {
		String s1 = sc.next();
		String s2 = sc.next();
		int x = Integer.parseInt(s1+s2);
		for(int i=0;Math.pow(i,2)<=x;i++) {
			if(Math.pow(i, 2)==x) {
				out.println("Yes");
				return;
			}
		}
		out.println("No");
	}
}