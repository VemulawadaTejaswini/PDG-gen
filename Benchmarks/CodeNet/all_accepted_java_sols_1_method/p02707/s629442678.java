import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(f.readLine());
        int[] freq = new int[n+1];
        StringTokenizer st = new StringTokenizer(f.readLine());
        for(int i = 0; i < n-1; i++){
            freq[Integer.parseInt(st.nextToken())]++;
        }
        for(int i = 1; i <= n; i++){
            out.println(freq[i]);
        }


        out.close();
    }
}
