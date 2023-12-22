import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		double c = Double.parseDouble(a+b);
		double ans = Math.sqrt(c);
		int num = (int) ans;
		if(ans - num == 0) {
			System.out.println("Yes");
		} else if (ans - num !=0) {
			System.out.println("No");
		}
	}
}
