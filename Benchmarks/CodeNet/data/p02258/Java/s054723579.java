import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]){
        int maxv = -2000000000;
        int minv = 2000000000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            int v;
            int saveBox[] = new int[n];
            for (int i=0; i<n ; i++) {
                v = Integer.parseInt(br.readLine());
                maxv = Math.max(maxv,v - minv);
                minv = Math.min(minv, v);
            }    
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        System.out.println(maxv);
    }
}
