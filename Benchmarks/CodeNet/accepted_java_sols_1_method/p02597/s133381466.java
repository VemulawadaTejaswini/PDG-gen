import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		int n = Integer.parseInt(reader.readLine());
		String c = reader.readLine();
		int ans = Integer.MAX_VALUE, r = 0, w = 0;
		for (int i = 0; i < n; i++) {
			if (c.charAt(i) == 'R') {
				r++;
			}
		}
		ans = r;
		for (int i = 0; i < n; i++) {
			if (c.charAt(i) == 'R') {
				r--;
			}
			if (c.charAt(i) == 'W') {
				w++;
			}
			ans = Math.min(ans, Math.min(r, w) + Math.abs(r - w));
		}
		out.print(ans);
		out.flush();
		out.close();
    }

}
