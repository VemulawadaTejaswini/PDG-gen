// package Contest#176;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        // out.println(n / x);
        int time = (int) Math.ceil(1.0 * n / x);
        out.println(time * t);
        out.close();
    }
}