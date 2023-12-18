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
		input = reader.readLine().split(" ");
		int n = Integer.parseInt(input[0]);
		long d = Integer.parseInt(input[1]);
		int ans = 0;
		for (int i = 0; i < n; i++) {
			input = reader.readLine().split(" ");
			long x = Integer.parseInt(input[0]), y = Integer.parseInt(input[1]);
			if (Math.sqrt(x * x + y * y) <= d) {
				ans++;
			}
		}
		out.print(ans);
		out.flush();
		out.close();
    }

}
