import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader bu = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] inp = bu.readLine().split(" ");
        int n = Integer.parseInt(inp[0]), k = Integer.parseInt(inp[1]);
        inp = bu.readLine().split(" ");
        int [] arr = new int[n];
        for (int pos = 0; pos < n; pos++) {
            arr[pos] = Integer.parseInt(inp[pos]);
        }

        for (int pos = k; pos < n; pos++) {
            if (arr[pos] > arr[pos-k])
                sb.append("Yes\n");
            else
                sb.append("No\n");
        }
        System.out.print(sb);
    }
}
