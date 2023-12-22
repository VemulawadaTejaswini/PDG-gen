
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i = str.length() - 1; i > -1; i--){
			System.out.printf("%c", str.charAt(i));
		}
		System.out.println();
	}
}