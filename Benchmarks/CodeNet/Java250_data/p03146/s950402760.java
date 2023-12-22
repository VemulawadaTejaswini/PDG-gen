import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Main{



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tmp = scanner.nextLine().split(" ");
		int n        = Integer.parseInt(tmp[0]);
		int count    = 1;
		Set<Integer> set = new HashSet<>();

		for(;;) {

			set.add(n);
			if(n % 2 == 0) {
				n /= 2;
			}else {
				n  = 3 * n + 1;

			}

			count++;
			if(set.contains(n)) {
				break;
			}

		}

		System.out.println(count);

	}
}