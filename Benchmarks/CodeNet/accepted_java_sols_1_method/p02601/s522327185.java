import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		long a = s.nextInt(), b = s.nextInt(), c = s.nextInt();
		int k = s.nextInt();
		while (b <= a) {
			b *= 2;
			k--;
		}
		while (c <= b) {
			c *= 2;
			k--;
		}
		out.print(k < 0 ? "No" : "Yes");
		out.flush();
		out.close();
    }
}
