import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public class Main {
	
    public static void main(String args[] ) throws Exception {
    	Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		int X = s.nextInt(), Y = s.nextInt();
		if(Y % 2 == 1) {
			out.print("No");
		} else {
			Y /= 2;
			int b = (Y - X), a = X - b;
			if(b < 0 || a < 0) {
				out.print("No");
			} else {
				out.print("Yes");
			}
		}
		out.flush();

    }
	

}
