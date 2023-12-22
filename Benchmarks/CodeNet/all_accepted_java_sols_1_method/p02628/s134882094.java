import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] inp = buffer.readLine().split(" ");
        int n = Integer.parseInt(inp[0]), k = Integer.parseInt(inp[1]);
        inp = buffer.readLine().split(" ");
        int [] prices = new int[n];
        for (int pos = 0; pos < n; pos++)
            prices[pos] = Integer.parseInt(inp[pos]);
        Arrays.sort(prices);
        int sum = 0;
        for (int pos = 0; pos < k; pos++) {
            sum += prices[pos];
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
