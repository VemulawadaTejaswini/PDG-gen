import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(in.readLine());
            StringTokenizer st = new StringTokenizer(in.readLine());
            int tallest = 0;
            int res = 0;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                if (x >= tallest) {
                    tallest = Math.max(tallest, x);
                    res++;
                }
            }
            System.out.println(res);
        } catch (IOException ex) {

        }
    }

}