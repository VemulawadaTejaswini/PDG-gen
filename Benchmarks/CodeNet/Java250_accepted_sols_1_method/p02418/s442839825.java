import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in);) {
			
			String s = sc.next();
			String p = sc.next();
			
			String search = s;
			
			for(int i = 0; i < s.length(); i++) {
				
				search = s.substring(i) + s.substring(0, i);
				
				if(search.contains(p)) {
					System.out.println("Yes");
					return;
				}
			}
			
			System.out.println("No");
		}
	}
}
