import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        long minval = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        for (int pos = 0; pos < n; pos++) {
            String [] inp = buffer.readLine().split(" ");
            long a = Integer.parseInt(inp[0]), b = Integer.parseInt(inp[1]);
            long res = a+b;
            minval = Math.min(minval, res);
            maxVal = Math.max(maxVal, res);
        }
        long res = maxVal-minval;
        System.out.println(res);
    }
}
