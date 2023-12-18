import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.equals("0")) System.out.println("No"); 
		else solve(s, s.length());
	}

	private static void solve(String s, int len) {
		// TODO Auto-generated method stub
//		int div = 1;
//		if (len % 3 == 0) {
//			div = 3;
//		} else if (len % 2 == 0) {
//			div = 2;
//		} 
		long sum = 0;
		for(int i = 0; i < len; i++) {
			sum += s.charAt(i) - '0';
		}
		if (sum % 9 == 0) 
			System.out.println("Yes");
		else 
			System.out.println("No");
	}

}
