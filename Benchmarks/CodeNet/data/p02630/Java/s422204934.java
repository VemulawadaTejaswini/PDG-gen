import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(buffer.readLine());
        String [] inp = buffer.readLine().split(" ");
        long sum = 0;
        Integer [] arr = new Integer[n];
        for (int pos = 0; pos < n; pos++) {
            sum += Integer.parseInt(inp[pos]);
            arr[pos] = Integer.parseInt(inp[pos]);
        }
        int [] frequency = new  int[100001];
        for (int num :
                arr) {
            frequency[num]++;
        }
        int q = Integer.parseInt(buffer.readLine());
        for (int pos = 0; pos < q; pos++) {
            inp = buffer.readLine().split(" ");
            int b = Integer.parseInt(inp[0]), c = Integer.parseInt(inp[1]);
            if (frequency[b]!=0 && b != c) {
                sum -= b* frequency[b];
                frequency[c] += frequency[b];
                sum += c*frequency[b];
                frequency[b] = 0;
            }
            sb.append(sum+"\n");
        }
        System.out.println(sb);
    }
}
