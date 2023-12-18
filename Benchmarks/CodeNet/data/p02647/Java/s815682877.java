import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static int[] next(int[] prev) {
		int[] curr = new int[prev.length];
//		Arrays.fill(curr, 1);
		for(int i = 0; i < prev.length; i++) {
			int x = prev[i];
			for(int j = Math.max(0, i - x); j <= Math.min(prev.length - 1, i + x); j++) {
				curr[j]++;
			}
		}
		return curr;
	}
	
    public static void main(String[] args) throws IOException {
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt(), k = s.nextInt();
    	int[] arr = new int[n];
    	for(int i = 0; i < n; i++) {
    		arr[i] = s.nextInt();
    	}
    	while(k-->0) {
    		arr = next(arr);
    		if(arr[0] == n) {
    			break;
    		}
    	}
    	StringBuffer strbf = new StringBuffer();
    	for(int i = 0; i < n; i++) {
    		strbf.append(arr[i] + " ");
    	}
    	System.out.print(strbf.toString());
    }
}
