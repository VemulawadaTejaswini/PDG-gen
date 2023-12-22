import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			char[] ch = sc.next().toCharArray();
			int counter = 0;
			
			for (char c: ch) {
				if (c == 'o') {
					counter++;
				}
			}
			
			if (ch.length < 8) {
				System.out.println("YES");
			} else {
				if (ch.length - counter <= 7) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}