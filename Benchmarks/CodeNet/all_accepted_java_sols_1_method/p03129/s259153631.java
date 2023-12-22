import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		sc.close();
		String res = "NO";

		if(n+1 >= k*2) {
			res = "YES";
		}
		System.out.println(res);
	}

}
