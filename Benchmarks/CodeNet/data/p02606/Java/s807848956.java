import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int l = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        int d = Integer.parseInt(input[2]);
        int ans = 0;
        
        for(int i = l; i <= r; i++){
            if(i % d == 0){
                ans++;
            }
        }
        
        out.println(ans);
        out.close();
        
    }
}