import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int d = in.nextInt();
		int t = in.nextInt();
		int s = in.nextInt();
		if (t * s < d)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
