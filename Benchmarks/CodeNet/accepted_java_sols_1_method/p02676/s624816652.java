import java.util.Scanner;

public class Main {
	static Scanner src = new Scanner(System.in);
	public static void main(String[] args) {
		int k = src.nextInt();
		String str = src.next();
		if(str.length() > k) {
			str = str.substring(0, k) + "...";
		}
		System.out.println(str);
	}
}
