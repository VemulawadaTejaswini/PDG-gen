import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        boolean isEasyStep = true;
        
        for(int i = 0; i  < str.length(); i++){
            char c = str.charAt(i);
            
            if( (i + 1) % 2 == 0){
                if( c == 'R'){
                    isEasyStep = false;
                    break;
                }
            }else{
                if( c == 'L'){
                    isEasyStep = false;
                    break;
                }
            }
        }
        
        System.out.println( isEasyStep ? "Yes" : "No");

    }
}
