import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String [] inp =buffer.readLine().split(" ");
        long a = Integer.parseInt(inp[0]), b = Integer.parseInt(inp[1]), c = Integer.parseInt(inp[2]), d = Integer.parseInt(inp[3]);
        long res1 = a*d, res2 = a*c, res3 = b*c, res4 = b*d;
        long res = Math.max(res1,Math.max(res2, Math.max(res3, res4)));
        System.out.println(res);
    }
}
