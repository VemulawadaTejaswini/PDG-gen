import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		sc.close();
		if(A.length() > B.length()) {
			System.out.println("GREATER");
		}else if(A.length() < B.length()) {
			System.out.println("LESS");
		}else {
			int l = A.length();
			for(int i = 0; i < l; i++) {
				if(A.charAt(i) > B.charAt(i)) {
					System.out.println("GREATER");
					System.exit(0);
				}else if(A.charAt(i) < B.charAt(i)) {
					System.out.println("LESS");
					System.exit(0);
				}
			}
			System.out.println("EQUAL");
		}
	}
}