import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        int k = Integer.parseInt(br.readLine());
        
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        
        String ans = "NG";
        
        for(int i = a; i <= b; i++){
            if(i % k == 0){
                ans = "OK";
                break;
            }
        }
        
        out.println(ans);
        
        out.close();
        
    }
}