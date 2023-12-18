import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int n = Integer.parseInt(st.nextToken());
        long d = Long.parseLong(st.nextToken());
        d = d*d;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(f.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long dist = a*a + b*b;
            if(dist <= d) cnt++;
        }
        out.println(cnt);


        out.close();
    }
}
