import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		char[] c = new char[3];
		c = n.toCharArray();
		for(int i = 0; i < 3; i++) {
			if(c[i] == '1')c[i] = '9';
			else if(c[i] == '9')c[i] = '1';
			System.out.print(c[i]);
		}
	}
}