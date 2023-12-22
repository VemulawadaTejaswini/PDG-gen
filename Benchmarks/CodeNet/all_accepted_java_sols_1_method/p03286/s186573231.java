import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = "";
        
        while (true) {
            if (n%-2 == 0) {
                s = "0" + s;
                
            }
            else {
                s = "1" + s;
                n--;
            }
            if (n/-2==0) break;
            n /= -2;
        }
        
        System.out.println(s);
    }
}



