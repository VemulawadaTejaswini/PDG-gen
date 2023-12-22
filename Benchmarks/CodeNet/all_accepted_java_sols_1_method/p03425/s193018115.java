import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] march = new int[5];
        
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.charAt(0) == 'M') march[0]++;
            if (s.charAt(0) == 'A') march[1]++;
            if (s.charAt(0) == 'R') march[2]++;
            if (s.charAt(0) == 'C') march[3]++;
            if (s.charAt(0) == 'H') march[4]++;
        }
        
        long ans = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = i+1; j < 5; j++) {
                for (int k = j+1; k < 5; k++) {
                    ans += (long)march[i]*march[j]*march[k];
                }
            }
        }
        
        System.out.println(ans);
    }
}



