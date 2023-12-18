
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] c = sc.next().toCharArray();
		
		if(c[0] == c[1] && c[2] == c[1]) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}

	}

}