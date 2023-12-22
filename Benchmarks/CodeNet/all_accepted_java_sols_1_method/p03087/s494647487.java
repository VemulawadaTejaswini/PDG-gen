import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nq = br.readLine().split(" ");
        int n = Integer.parseInt(nq[0]);
        int q = Integer.parseInt(nq[1]);
        String s = br.readLine();
        int[] count = new int[n];
        
        int cnt = 0;
        for (int i = 0; i < n-1; i++) {
            if (s.charAt(i)=='A' && s.charAt(i+1)=='C') {
                cnt++;
            }
            count[i+1] = cnt;
        }
        
        //System.out.println(count[2]);
        
        for (int i = 0; i < q; i++) {
            String[] lr = br.readLine().split(" ");
            int l = Integer.parseInt(lr[0])-1;
            int r = Integer.parseInt(lr[1])-1;
            
            System.out.println(count[r]-count[l]);
        }
        
        
    }
}



