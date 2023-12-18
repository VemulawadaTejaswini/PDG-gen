import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		String sum = "";
		for(int i = 0 ; i < n ; i++) {
			sum += "" + s.charAt(i) + t.charAt(i);
		}

		sc.close();
		System.out.println(sum);

	}
}

