import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
            while(true) {
                s = br.readLine();
                if(s.equals("0")) break;
                
                int sum = 0;
                for(int i = 0; i < s.length(); i++) {
                    sum += Character.getNumericValue(s.charAt(i));
                }
                System.out.println(sum);
            }
            
        } catch(IOException e) {
            e.printStackTrace();
        }
        
    }
}

