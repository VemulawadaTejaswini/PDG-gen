import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		long k = scanner.nextLong();
		for (char c: s.toCharArray()) {
			if (k==1) {
				System.out.println(c);
				break;
			}else if (c!='1'){
				System.out.println(c);
				break;
			}else k--;
		}
	}
}