import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); sc.close();
		char[] ch = str.toCharArray();
		for (int i=0; i<ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				ch[i] = Character.toLowerCase(ch[i]);
				System.out.print(ch[i]);
			} else {
				ch[i] = Character.toUpperCase(ch[i]);
				System.out.print(ch[i]);
			}
		}
               System.out.println();
	}
}