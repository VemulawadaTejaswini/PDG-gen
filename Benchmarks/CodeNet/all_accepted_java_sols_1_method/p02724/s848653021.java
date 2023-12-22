
import java.util.Scanner;

class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

        // 1
		// String s = scanner.next();
		// System.out.println((s.length() == 6 && s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) ? "Yes" : "No");
        
        // 2
        int x = scanner.nextInt();
        int res = x / 500 * 1000 + x % 500 / 5 * 5;
        System.out.println(res);
        scanner.close();
	}
}