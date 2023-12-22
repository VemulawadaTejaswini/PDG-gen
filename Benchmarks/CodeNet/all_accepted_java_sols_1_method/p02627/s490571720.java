import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();

		if(Character.isUpperCase(s[0])){
			System.out.println("A");
		} else {
			System.out.println("a");
		}
	}
}