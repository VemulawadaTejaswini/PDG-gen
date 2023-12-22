import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Integer[] h = new Integer[n];
        
        for (int i = 0; i < n; i++) h[i] = Integer.parseInt(sc.next());
        
        Boolean[] f = new Boolean[n];
        
        Arrays.fill(f, true);
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;
            if (h[a] <= h[b]) {
                f[a] = false;
            }
            if (h[b] <= h[a]) {
                f[b] = false;
            }
        }
        
        int c = 0;
        for (boolean i : f){
            if (i) c++;
        }
        System.out.println(c);
    }
}