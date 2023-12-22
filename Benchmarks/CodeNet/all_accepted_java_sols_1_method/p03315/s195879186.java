import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)){
			String s = sc.next();
			int result = 0;
			
			for (int i = 0; i < 4; i++) {
				String a = s.substring(i, i+1);
				if (a.equals("+")) {
					result += 1;
				} else {
					result -= 1;
				}
			}
			System.out.println(result);
		}
	}
}
