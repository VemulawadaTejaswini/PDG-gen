import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.length()==2) {
			System.out.println(s);
		} else {
			for (int i=0;i<3;i++) {
				System.out.print(s.charAt(2-i));
			}
		}
	}
}
