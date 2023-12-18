
import java.util.Scanner;

public class Main {


	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int k = sc.nextInt();
		String s = sc.next();
		

		System.out.println(s.substring(0, k-1)+String.valueOf((char)(s.charAt(k-1)-'A'+'a'))+s.substring(k));

	}
}