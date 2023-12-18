import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int[] c = new int[m];
        for(int i = 0; i < m; i++){
            c[i] = Integer.parseInt(sc.next());
        }
        
        int[] t = new int[n+1];
        Arrays.fill(t, Integer.MAX_VALUE /2);
        t[0] = 0;
        
        for(int i = 0; i < m; i++){
            for(int j = c[i]; j <= n; j++){
                t[j] = Math.min(t[j], t[j - c[i]] +1);
            }
        }
        
        System.out.println(t[n]);
    }
}
