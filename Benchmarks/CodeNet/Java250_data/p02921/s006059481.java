import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        System.out.println(solve(in));
        
      }
      
      public static String solve(Scanner in) {

        String S = in.next();
        String T = in.next();
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == T.charAt(i)) count++;
        }

        return String.valueOf(count);
      }
      
    
}