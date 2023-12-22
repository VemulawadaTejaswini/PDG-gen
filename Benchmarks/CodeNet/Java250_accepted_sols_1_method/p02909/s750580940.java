import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    
        String s = br.readLine();
        
        if(s.equals("Sunny")){
            out.println("Cloudy");
        }else if(s.equals("Cloudy")){
            out.println("Rainy");
        }else{
            out.println("Sunny");
        }
         
        out.close();
        
    }
}