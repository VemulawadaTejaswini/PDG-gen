import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] input;
		int[] arr = new int[5];
		int ans = 0;
		for(int i = 0; i < 5; i++) {
			arr[i] = s.nextInt();
			if(arr[i] == 0) {
				ans = i + 1;
			}
		}
		out.print(ans);
		out.flush();
		out.close();
    }
}
