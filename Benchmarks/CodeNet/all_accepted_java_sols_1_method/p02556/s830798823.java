import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        long minval = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        long minVal2 = minval, maxVal2 = maxVal;
        for (int pos = 0; pos < n; pos++) {
            String [] inp = buffer.readLine().split(" ");
            long a = Integer.parseInt(inp[0]), b = Integer.parseInt(inp[1]);
            long res = a+b, res2 = a-b;
            minval = Math.min(minval, res);
            maxVal = Math.max(maxVal, res);
            minVal2 = Math.min(minVal2, res2);
            maxVal2 = Math.max(maxVal2, res2);
        }
        long res = Math.max(maxVal-minval, maxVal2-minVal2);
        System.out.println(res);
    }
}
