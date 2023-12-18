import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		int k  =sc.nextInt()-1;
		sc.close();
		char ch = str.charAt(k);
		for (int i=0;i<n;i++) {
			System.out.print((str.charAt(i)!=ch)?"*":str.charAt(i));
		}
		System.out.print("\n");
	}
}
