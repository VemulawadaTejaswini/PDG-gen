import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int first = a*c;
		int second = a*d;
		int third = b*c;
		int fourth = b*d;
		int firstmax = Math.max(first, second);
		int secondman = Math.max(third, fourth);
		System.out.println(Math.max(firstmax, secondman));
	}

}