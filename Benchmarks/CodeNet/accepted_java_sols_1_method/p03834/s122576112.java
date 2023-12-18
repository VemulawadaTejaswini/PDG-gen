import java.util.Scanner;

public class Main {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c[] = s.toCharArray();
		c[5] = ' ';
		c[13] = ' ';
		for(int i=0;i<=18;i++) {
			System.out.print(c[i]);
		}
	}
}