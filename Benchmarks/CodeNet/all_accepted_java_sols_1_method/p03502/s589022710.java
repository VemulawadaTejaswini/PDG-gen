import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();

		char[] ch = N.toCharArray();
		int f = 0;
		for(int i = 0;i < ch.length;i++) {
			f += Character.getNumericValue(ch[i]);
		}
		System.out.println(Integer.parseInt(N)%f == 0 ? "Yes" : "No");
	}
}