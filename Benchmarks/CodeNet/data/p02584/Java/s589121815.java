import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] t = scanner.nextLine().split(" ");
		long x = Long.parseLong(t[0]);
		long k = Long.parseLong(t[1]);
		long d = Long.parseLong(t[2]);
		long ans = 0;

		long amari = Math.abs(x % d);
		long sho   = Math.abs(x - amari) / d;

		if(sho >= k) {

			ans = Math.abs(x) - k * d;
		}else {
			ans = Math.abs(amari - d * (Math.abs(k - sho) % 2));
		}

		System.out.println(ans);
	}
}