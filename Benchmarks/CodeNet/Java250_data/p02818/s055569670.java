import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		long a = in.nextLong();
		long b = in.nextLong();
		long k = in.nextLong();
		if (a > k)
			System.out.println((a - k) + " " + b);
		else if (b > k - a)
			System.out.println(0 + " " + (b - k + a));
		else
			System.out.println(0 + " " + 0);
	}
}