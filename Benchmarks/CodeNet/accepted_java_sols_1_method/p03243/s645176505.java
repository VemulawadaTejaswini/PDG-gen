import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = N; i < 1000; i++) {
			String s = String.valueOf(i);
			if (s.charAt(0) == s.charAt(1) && s.charAt(0) == s.charAt(2)) {
				System.out.println(s);
				return;
			}
		}
	}
}
