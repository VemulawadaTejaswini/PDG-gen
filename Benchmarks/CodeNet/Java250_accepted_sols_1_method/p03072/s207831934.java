import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] h = new int[N];
        h[0] = Integer.parseInt(sc.next());
        int max = h[0];
        int count = 1;
        for(int i= 1; i < N; i++) {
            h[i] = Integer.parseInt(sc.next());
            if(h[i] >= max) {
                count++;
                max = h[i];
            }
        }
        System.out.println(count);
        
        
        
    }
}