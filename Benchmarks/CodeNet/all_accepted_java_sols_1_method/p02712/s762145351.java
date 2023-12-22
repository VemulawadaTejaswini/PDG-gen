import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        long sum = 0;
        int n = Integer.parseInt(f.readLine());
        for(int i = 1; i <= n; i++){
            if(i % 3 != 0 && i % 5 != 0) sum+=i;
        }
        out.println(sum);
        out.close();
    }
}
