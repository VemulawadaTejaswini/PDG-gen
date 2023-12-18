import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(f.readLine());
        String str = new String(f.readLine());
        int r = 0;
        int w = 0;
        for(int i = 0; i < n; i++){
            if(str.charAt(i) == 'R') r++;
            else w++;
        }
        int cnt = 0;
        for(int i = 0; i < r; i++){
            if(str.charAt(i) == 'W') cnt++;
        }
        out.println(cnt);



        out.close();
    }
}
