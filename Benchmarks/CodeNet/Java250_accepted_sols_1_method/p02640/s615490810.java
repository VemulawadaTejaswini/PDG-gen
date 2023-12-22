import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y= Integer.parseInt(input[1]);
        String ans = "No";
        
        for(int i = 0; i <= x; i++){
            if(y == 2 * i + 4 * (x - i)){
                ans = "Yes";
                break;
            }
        }
        
        out.println(ans);
        out.close();
        
    }
}