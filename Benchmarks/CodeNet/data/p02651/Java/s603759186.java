import java.util.*;
import java.io.*;

public class Main {
	public static void main (String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
		    int n = Integer.parseInt(br.readLine());
		    long[] arr = new long[n];
		    String[] line = br.readLine().split(" ", n);
		    for (int j = 0; j < n; j++) {
		        arr[j] = Long.parseLong(line[j]);
		    }
		    char[] order = br.readLine().toCharArray();
		    HashSet<Long> set = new HashSet<>();
		    set.add(0L);
		    boolean isWin = true;
		    for (int j = n - 1; j >= 0; j--) {
		        if (order[j] == '0') {
		            HashSet<Long> tmp = new HashSet<>();
		            for (long x : set) {
		                long y = x ^ arr[j];
		                if (!set.contains(y)) {
		                    tmp.add(y);
		                }
		            }
		            set.addAll(tmp);
		        } else {
		            if (!set.contains(arr[j])) {
		                isWin = false;
		                break;
		            }
		        }
		    }
		    if (isWin) {
		        sb.append("0\n");
		    } else {
		        sb.append("1\n");
		    }
		}
		System.out.print(sb);
	}
}
