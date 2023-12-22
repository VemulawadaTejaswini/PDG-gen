import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Pattern p = Pattern.compile("^[1-9]$");
		Matcher ma = p.matcher(String.valueOf(a));
		Matcher mb = p.matcher(String.valueOf(b));
		if(ma.find() && mb.find()) {
			System.out.println(a*b);
		}else {
			System.out.println(-1);
		}
		sc.close();
	}
}