import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] inp = buffer.readLine().split(" ");
        int n = Integer.parseInt(inp[0]), maxDis = Integer.parseInt(inp[1]);
        int cnt = 0;
        for (int pos = 0; pos < n; pos++) {
            inp = buffer.readLine().split(" ");
            long x = Integer.parseInt(inp[0]), y = Integer.parseInt(inp[1]);
//            if (x*x+y*y<0)continue;
            double value = Math.sqrt((x*x)+(y*y));
            if (value<=maxDis) {
                cnt++;
            }
        }
        sb.append(cnt+"\n");
        System.out.println(sb);
    }
}
