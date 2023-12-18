import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        for(int i = 0; i < 7; i++){
            if(s.equals(days[i])){
                out.println(7 - i);
                break;
            }
        }
        
        out.close();
        
    }
}