import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String C = sc.next();
		char char_C = C.charAt(0);
		System.out.println((char)(char_C+1));
	}

}
