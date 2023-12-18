import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        // int n = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int count = 0;
        for(int i=11; i<=d; i++) {
          if((i%10)*(i/10) <= m)
            if((i%10)*(i/10) >= 1)
              if(i%10 >= 2)
                if(i/10 >= 2)
                  count++;
        }
        out.println(count);

        out.close(); System.exit(0);
    }
}
