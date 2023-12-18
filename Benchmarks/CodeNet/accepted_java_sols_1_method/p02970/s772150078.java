import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = in.nextInt();
		int d = in.nextInt();
		int x = 2 * d + 1;
		if (n % x == 0)
			System.out.println(n / x);
		else
			System.out.println(n / x + 1);
		in.close();
	}
}
