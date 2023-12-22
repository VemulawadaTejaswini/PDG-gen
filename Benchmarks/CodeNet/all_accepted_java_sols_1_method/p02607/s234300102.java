import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int count = 0;
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
            if(a[i] % 2 == 1 && (i+1) % 2 == 1) count++;
        }
        System.out.println(count);
    
    }
}
