import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] abc = line.split(" ", 0);
        
        int A = Integer.parseInt(abc[0]);
        int B = Integer.parseInt(abc[1]);
        int X = Integer.parseInt(abc[2]);
        
        if(X >= A && A + B >= X){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}