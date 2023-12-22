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
			long a = Long.parseLong(t[0]) - 1;
			long b = Long.parseLong(t[1]);
			long c = Long.parseLong(t[2]);
			long d = Long.parseLong(t[3]);
			long m = minbai(c, d);
			long adiv = a - Math.floorDiv(a, c) - Math.floorDiv(a, d) + Math.floorDiv(a, m);
			long bdiv = b - Math.floorDiv(b, c) - Math.floorDiv(b, d) + Math.floorDiv(b, m);

			System.out.println(bdiv - adiv);



		}
		public static long gcd(long x, long y) {

			if(x % y == 0) {

				return y;

			}else {

				return gcd(y, x % y);

			}

		}

		public static long minbai(long x, long y) {

			return x * y / gcd(x,y);

		}

	}