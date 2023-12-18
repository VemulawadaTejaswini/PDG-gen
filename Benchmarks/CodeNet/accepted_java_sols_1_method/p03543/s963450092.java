import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		if((a[0] == a[1] && a[0] == a[2]) || (a[1] == a[2] && a[1] == a[3])) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
