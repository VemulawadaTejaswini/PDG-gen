import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
		String str;
		if(k >= s.length()) str = s;
		else {
			str = s.substring(0, k);
			str += "...";
		}
		System.out.println(str);
	}
}