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
		int k = Integer.parseInt(reader.readLine());
		Set<Long> remainder = new HashSet<>();
		long num = 0;
		boolean possible = true;
		int count = 0;
		do {
			num = num * 10 + 7;
			count++;
			num %= k;
			if (remainder.contains(num)) {
				possible = false;
				break;
			}
			remainder.add(num);
		} while (num != 0);
		if (possible) {
			out.print(count);
		} else {
			out.print(-1);
		}
		out.flush();
		out.close();
    }

}
