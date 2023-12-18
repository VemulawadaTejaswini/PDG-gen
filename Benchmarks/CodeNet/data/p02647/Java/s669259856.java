import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] first = br.readLine().split(" ", 2);
		int n = Integer.parseInt(first[0]);
		int k = Integer.parseInt(first[1]);
		int[] strength = new int[n];
		String[] second = br.readLine().split(" ", n);
		for (int i = 0; i < n; i++) {
		    strength[i] = Integer.parseInt(second[i]);
		}
		for (int i = 0; i < k; i++) {
		    int[] imos = new int[n];
		    for (int j = 0; j < n; j++) {
		        imos[Math.max(j - strength[j], 0)]++;
		        if (j + strength[j] + 1 < n) {
		            imos[j + strength[j] + 1]--;
		        }
		    }
		    for (int j = 1; j < n; j++) {
		        imos[j] += imos[j - 1];
		    }
		    strength = imos;
		    if (isFull(strength)) {
		        break;
		    }
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
		    if (i > 0) {
		        sb.append(" ");
		    }
		    sb.append(strength[i]);
		}
		System.out.print(sb);
	}
	
	static boolean isFull(int[] arr) {
	    for (int x : arr) {
	        if (x < arr.length) {
	            return false;
	        }
	    }
	    return true;
	}
}
