import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int d = in.nextInt();
		int n = in.nextInt();
		if (n == 100)
			n = 101;
		for (int i = 0; i < d; i++)
			n *= 100;
		System.out.println(n);
		in.close();
	}
}