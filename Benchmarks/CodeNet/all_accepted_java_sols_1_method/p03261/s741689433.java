import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = sc.nextInt();
		String[] ws = new String[n];
		
		String w = sc.next();
		ws[0] = w;
		char next = w.charAt(w.length() - 1);
		
		for(int i = 1; i < n; i++) {
			w = sc.next();
			if(w.charAt(0) != next) {
				System.out.println("No");
				return;
			}
			for(int j = 0; j < i; j++) {
				if(w.equals(ws[j])) {
					System.out.println("No");
					return;
				}
			}
			ws[i] = w;
			next = w.charAt(w.length() - 1);
		}
		
		System.out.println("Yes");
	}
}