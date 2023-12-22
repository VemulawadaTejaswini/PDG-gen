import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        int count1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) != '0') count1++;
            }
            else {
                if (s.charAt(i) != '1') count1++;
            }
        }
        
        int count2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) != '1') count2++;
            }
            else {
                if (s.charAt(i) != '0') count2++;
            }
        }
        
        //System.out.println(count2);
        System.out.println(Math.min(count1, count2));
    }
}



