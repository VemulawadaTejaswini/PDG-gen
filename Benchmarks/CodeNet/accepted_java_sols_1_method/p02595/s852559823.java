
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n   = Integer.parseInt(tmp[0]);
		long d  = Long.parseLong(tmp[1]);
		int ans = 0;

		for(int i = 0; i < n; i++) {

			long a   = scanner.nextLong();
			long b   = scanner.nextLong();
			double c = Math.sqrt(a * a + b * b);
			if(c <= d) {
				ans++;
			}

		}

		System.out.println(ans);
	}
}
