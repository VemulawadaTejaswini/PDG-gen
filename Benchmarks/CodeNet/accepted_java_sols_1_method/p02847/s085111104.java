import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static String[] w = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		String s = in.next();
		int i = 0;
		for (; i < w.length; i++)
			if (s.equals(w[i]))
				break;
		System.out.println(7 - i);
	}
}