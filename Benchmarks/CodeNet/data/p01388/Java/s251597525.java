import java.io.*;
import java.util.*;
import java.math.*;

public class Main {

	Scanner sc = new Scanner(System.in);

	void run() {
		String in = sc.next();
		int[] map = new int[4];
		for (char ch : in.toCharArray()) {
			if ("KUPC".indexOf(ch) != -1)
				map["KUPC".indexOf(ch)]++;
		}
		int min = Integer.MAX_VALUE;
		for (int a : map) {
			min = Math.min(a, min);
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}