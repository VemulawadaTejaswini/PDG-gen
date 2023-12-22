import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int l = in.nextInt();
		int r = in.nextInt();
		System.out.println(solve(l, r));
		in.close();
	}

	private static int solve(int l, int r) {
		int s = 2019;
		if (l % 2019 == 0)
			return 0;
		if ((l / 2019 + 1) * 2019 <= r)
			return 0;
		for (int i = l % 2019; i < r % 2019; i++)
			for (int j = i + 1; j <= r % 2019; j++)
				if (s > (i * j) % 2019)
					s = (i * j) % 2019;
		return s;
	}
}
