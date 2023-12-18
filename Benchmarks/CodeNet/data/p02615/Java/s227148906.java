import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        Long[] a = new Long[n];
        for(int i=0; i<n; i++) {
            a[i] = Long.parseLong(sc.next());
        }
        
        Arrays.sort(a, Collections.reverseOrder());

        long sum = a[0];
        
        int x = 1;
        for(int i=0; i<n-2; i++) {
            sum += a[x];
            if(i % 2 == 1) {
                x++;
            }
        }
        
        System.out.println(sum);
    }
}