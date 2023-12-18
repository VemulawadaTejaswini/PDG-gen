import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.awt.Point;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = new char[4];
        
        int count = 1;
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            count = 1;
            for (int j = 0; j < s.length(); j++) {
                if (i == j) continue;
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
            if (count != 2) {
                flag = false;
                break;
            }
        }
        
        
        System.out.println(flag?"Yes":"No");
    }
}



