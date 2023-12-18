import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;


public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int count = 0;
        int i = 357;
        
        outer: while (i <= n) {
            String l = String.valueOf(i);
            for (int j = 0; j < l.length(); j++) {
                if (l.charAt(j) == '1' || l.charAt(j) == '2' || l.charAt(j) == '4' || l.charAt(j) == '6' || l.charAt(j) == '8' || l.charAt(j) == '9' || l.charAt(j) == '0') {
                    i += Math.pow(10, l.length()-j-1);
                    continue outer;
                }
            }
            /*if (l.contains("3") && l.contains("5") && l.contains("7") && !l.contains("1") && !l.contains("2") && !l.contains("4") && !l.contains("6") && !l.contains("8") && !l.contains("9") && !l.contains("0")) {
                //System.out.println(l);
                count++;
            }*/
            if (l.contains("3") && l.contains("5") && l.contains("7")) {
                count++;
            }
            i++;
            //System.out.println(l);
        }
        
        System.out.println(count);
    }
}
