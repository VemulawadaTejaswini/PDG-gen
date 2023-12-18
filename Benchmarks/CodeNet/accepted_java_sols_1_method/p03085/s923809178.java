import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();

		for (int i = 0; i < s.length; i++) {
			if(s[i] == 'A')System.out.print("T");
			else if(s[i] == 'T') System.out.print("A");
			else if(s[i] == 'C') System.out.print("G");
			else System.out.print("C");
		}
		sc.close();
	}
}