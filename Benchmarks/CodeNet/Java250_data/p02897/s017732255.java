import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    
        double n = Double.parseDouble(br.readLine());
        double count = 0;
        
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                count++;
            }
        }
         
        out.println(count / n);
        out.close();
        
    }
}