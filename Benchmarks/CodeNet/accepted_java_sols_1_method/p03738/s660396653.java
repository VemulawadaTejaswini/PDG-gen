import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		if(A.length() > B.length()) {
			System.out.println("GREATER");
		} else if(A.length() < B.length()) {
			System.out.println("LESS");
		} else {
			for(int i = 0; i < A.length(); i++) {
				if(A.charAt(i) > B.charAt(i)) {
					System.out.println("GREATER");
					return;
				} else if(A.charAt(i) < B.charAt(i)) {
					System.out.println("LESS");
					return;
				} 
			}
			System.out.println("EQUAL");
		}
		
		
	}
}
