import java.util.Scanner;

public class Main {
	static Scanner src = new Scanner(System.in);
	public static void main(String[] args) {
		String str1 = src.next();
		String str2 = src.next();
		if(str2.substring(0, str2.length() - 1).equals(str1)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}