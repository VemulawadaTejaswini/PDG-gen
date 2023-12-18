
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		boolean flag = (n % 2 == 0);
		if(flag){
			flag = s.equals(s.substring(n / 2) + s.substring(n / 2));
		}
		System.out.println(flag ? "Yes" : "No");
	}
}
