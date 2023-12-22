import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.awt.Point;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int d = Integer.parseInt(s[1]);
        
        System.out.println(n%(2*d+1)==0?n/(2*d+1):n/(2*d+1)+1);
    }

    
}



