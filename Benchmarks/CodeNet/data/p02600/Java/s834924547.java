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
		int x = s.nextInt();
		int ans = 0;
		if (x < 600) {
			ans = 8;
		} else if(x < 800) {
			ans = 7;
		} else if (x < 1000) {
			ans = 6;
		} else if(x < 1200) {
			ans = 5;
		} else if(x < 1400) {
			ans = 4;
		} else if(x < 1600) {
			ans = 3;
		} else if(x < 1800) {
			ans = 2; 
		} else {
			ans = 1;
		}
		out.print(ans);
		out.flush();
		out.close();
    }
}
