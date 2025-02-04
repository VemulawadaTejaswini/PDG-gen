
import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken()),
            k = Long.parseLong(st.nextToken());
        long[] counts = new long[100001];
        for (int i=0 ; i<n ; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()),
                b = Integer.parseInt(st.nextToken());
            counts[a] += b;
        }
        for (int i=1 ; i<100001 ; i++) {
            k -= counts[i];
            if (k <= 0) {
                System.out.println(i);
                return;
            }
        }
    }
}

