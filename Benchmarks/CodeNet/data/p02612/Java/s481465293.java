import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		sc.close();

		int ans = 1000 - N % 1000;
		if(ans == 1000) {
			System.out.println(0);
		}else {
			System.out.println(ans);
		}

	}

}