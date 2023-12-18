import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int w = Integer.parseInt(br.readLine());
            int[] x = new int[w+1];
            for (int i = 0; i < w+1; i++) {
                x[i] = i;
            }
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String st = br.readLine();
                String[] s = st.split(",", 0);
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                int sw = x[a];
                x[a] = x[b];
                x[b] = sw;
            }
            for (int i = 1; i < w+1; i++) {
                System.out.println(x[i]);
            }
        } catch (Exception ex) {
            System.exit(0);
        }
    }
}