import java.io.*;
import java.util.*;
 
/**
 * Created by Ayushi on 22 Aug 2020.
 * Problem:
 * Round:
 */
 
public class Main {
    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a  = br.readLine();
        long ans = 0;
        for (int i = 0; i < a.length(); i++) {
          ans += a.charAt(i);
        }

        System.out.println((ans%9==0) ? "Yes":"No");
    }
}
