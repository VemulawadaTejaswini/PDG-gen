import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		String s = sc.next();
		String t = sc.next();
		int a =sc.nextInt();
		int b =sc.nextInt();
		String u = sc.next();
		if (u.equals(s)) {
			System.out.print(a-1);
			System.out.print(" ");
			System.out.print(b);
		} else {
			System.out.print(a);
			System.out.print(" ");
			System.out.print(b-1);
		} 
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
}
