import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x = s.nextInt(), n = s.nextInt();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < n; i++) {
			set.add(s.nextInt());
		}
		int ans = -1, diff = 0;
		while(true) {
			if(!set.contains(x - diff)) {
				ans = x - diff;
				break;
			}
			if(!set.contains(x + diff)) {
				ans = x + diff;
				break;
			}
			diff++;
			//System.out.println(diff);
		}
		out.print(ans);
		out.flush();
		out.close();
	}

}
