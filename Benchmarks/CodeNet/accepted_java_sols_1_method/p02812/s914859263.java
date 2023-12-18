import java.util.*;

public class Main {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			String S = sc.next();
			
			int a = S.length();
			
			S = S.replaceAll("ABC", "");
			
			int b = S.length();
			
			int c = (a - b) / 3 ;
			System.out.println(c);
		}
}