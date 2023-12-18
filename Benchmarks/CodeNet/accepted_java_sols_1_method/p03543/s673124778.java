import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] c = sc.next().toCharArray();

		if (c[0] == c[1] && c[1]== c[2]) System.out.println("Yes");
		else if (c[1] == c[2] && c[2]== c[3]) System.out.println("Yes");
		else System.out.println("No");
	}
}
