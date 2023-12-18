import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int ab=a-b;

		if(ab<0) {
			ab=-ab;
		}
		int bc=b-c;
		if(bc<0) {
			bc=-bc;
		}
		int ac=a-c;
		if(ac<0) {
			ac=-ac;
		}

		if(ac<=d||(ab<=d&&bc<=d)) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}




	}
}
