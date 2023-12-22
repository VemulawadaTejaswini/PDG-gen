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
			int n = Integer.parseInt(t[0]);
			int l = Integer.parseInt(t[1]);

			int[] list = new int[n];

			int min = Integer.MAX_VALUE;
			int sum = 0;
			for(int i = 1; i <= n; i++) {
				list[i - 1] = i + l - 1;
				if(Math.abs(min) > Math.abs(list[i - 1])) {min = list[i - 1];}
				sum += list[i - 1];
			}

			System.out.println(sum - min);



		}
	}