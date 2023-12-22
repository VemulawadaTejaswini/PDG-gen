import java.util.Scanner;

public class Main {
	static char[] p = {'r', 's', 'p'};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();

		String ans = (k*500 >= x) ? "Yes" : "No";

		System.out.println(ans);

        return;
    }


}

