import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String s = scanner.next();
			
			String s1 = s.substring(0, 4).toUpperCase();
			String s2 = s.substring(s1.length(),s.length()).toUpperCase();

			System.out.println(s1+" "+s2);
		}
	}
}