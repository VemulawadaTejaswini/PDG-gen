import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner kbs = new Scanner(System.in);
		int a = kbs.nextInt();
		int b = kbs.nextInt();
		int c = kbs.nextInt();
		
		if(a != b && a != c && b != c) {
			System.out.println("No");
		}
		
		if(a == b && a != c && b != c) {
			System.out.println("Yes");
		}
		
		if(a != b && a == c && b != c) {
			System.out.println("Yes");
		}
		
		if(a != b && a != c && b == c) {
			System.out.println("Yes");
		}
		
		if(a == b && a == c && b == c) {
			System.out.println("No");
		}
		
		kbs.close();
	}

}
