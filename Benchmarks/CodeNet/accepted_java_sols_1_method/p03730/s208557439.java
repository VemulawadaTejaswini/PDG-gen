import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        String ans = "NO";
        
        for(int i = 1; i <= b; i++){
            if(a * i % b == c){
                ans = "YES";
                break;
            }
        }
        
        out.println(ans);
        out.close();
        
    }
}