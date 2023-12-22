import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int k = in.nextInt();
		int r = 0;
		for (int i = 0; i < n; i++)
			if (in.nextInt() >= k)
				r++;
		System.out.println(r);
		in.close();
	}
}