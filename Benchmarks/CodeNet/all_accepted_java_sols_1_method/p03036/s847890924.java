import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        long r = Long.parseLong(s[0]);
        long d = Long.parseLong(s[1]);
        long x2000 = Long.parseLong(s[2]);
        //int ans = b;
        
        
        long ans = x2000;
        for (int i = 0; i < 10; i++) {
            ans = r*ans-d;
            System.out.println(ans);
        }

        //System.out.println(ans);
    }
}



