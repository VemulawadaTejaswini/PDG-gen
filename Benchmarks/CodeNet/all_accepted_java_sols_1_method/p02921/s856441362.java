import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();
        
        int count = 0;
        for(int i = 0; i < 3; i++){
            if ( S.charAt(i) == T.charAt(i) ) count++;
        }
        
        System.out.println(count);
        
    }
}
