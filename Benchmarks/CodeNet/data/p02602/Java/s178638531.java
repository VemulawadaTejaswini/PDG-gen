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
		String[] input = reader.readLine().split(" ");
		int n = Integer.parseInt(input[0]), k = Integer.parseInt(input[1]);
		input = reader.readLine().split(" ");
		long[] a = new long[n];
		for(int i = 0; i < n; i++) {
			a[i] = Long.parseLong(input[i]);
		}
		long mul = 1;
		for(int i = 0; i < k; i++) {
			mul *= a[i];
		}
		long prev = mul;
		for(int i = k; i < n; i++) {
			mul *= a[i];
			mul /= a[i - k];
			out.println(mul > prev ? "Yes" : "No");
			prev = mul;
		}
		out.flush();
		out.close();
    }
}
