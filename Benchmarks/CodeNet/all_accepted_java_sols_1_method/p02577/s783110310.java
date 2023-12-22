import java.io.*;
 
/**
 * Created by Ayushi on 22 Aug 2020.
 * Problem:
 * Round:
 */
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a  = br.readLine();
        long ans = 0;
        for (int i = 0; i < a.length(); i++) {
          ans += Integer.parseInt(a.substring(i,i+1));
        }

        System.out.println((ans%9==0) ? "Yes":"No");
        //System.out.println(ans);
    }
}