
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		long a = Long.parseLong(sc.next());
		double b = Double.parseDouble(sc.next());
		long c = (long)(b*100);
		a = a * c;
		String s = String.valueOf(a);
		sb.append(s);
		int n = s.length();
		if(n <= 2) {
			System.out.println(0);
			return;
		}
		String ans = sb.substring(0, n-2).toString();
		System.out.println(ans);
		
	}


}
