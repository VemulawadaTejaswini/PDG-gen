import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] s = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] h = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] c = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		int[] d = {0,0,0,0,0,0,0,0,0,0,0,0,0};
		for (int i = 0; i < n; i++) {
			String[] card = br.readLine().split(" ");
			switch (card[0]) {
				case "S":
					change(Integer.parseInt(card[1]), s);
					break;
				case "H":
					change(Integer.parseInt(card[1]), h);
					break;
				case "C":
					change(Integer.parseInt(card[1]), c);
					break;
				case "D":
					change(Integer.parseInt(card[1]), d);
					break;
			}
		}
		print("S", s);
		print("H", h);
		print("C", c);
		print("D", d);
	}

	private static void print(String str, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				System.out.println(str + " " + (i + 1));
			}
		}
	}

	private static void change(int n, int[] array) {
		array[n - 1] = 1;
	}
}