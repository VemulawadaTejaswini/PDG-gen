import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(a == b && a != c ? "Yes" : a == c && a != b ? "Yes" : b == c && a != b ? "Yes" : "No");
	}

}
