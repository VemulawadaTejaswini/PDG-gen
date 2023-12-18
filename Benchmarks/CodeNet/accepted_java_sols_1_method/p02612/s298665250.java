import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int ans = 0;
		ans = n % 1000;
		if (ans == 0)
			System.out.println(0);
		else
			System.out.println(1000 - ans);
	}

}
