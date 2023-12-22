import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author saku
 */
public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader sd = new BufferedReader(new InputStreamReader(System.in));
        String str = sd.readLine();
        
        int x = Integer.parseInt(str),  h=x/3600,m,s;
        x %= 3600;
        m=x/60;
        x%=60;
        s = x;
        
        System.out.println(h + ":" + m + ":" +s);
        
    }     
}