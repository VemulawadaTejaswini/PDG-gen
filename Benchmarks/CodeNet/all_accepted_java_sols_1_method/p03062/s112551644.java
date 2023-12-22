import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //ABC125 D
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long[] a = new long[n];
        
        int count = 0;
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            
            if(a[i] < 0){
                count++;
            }
        }
        
        long res = Arrays.stream(a).map(Math::abs).sum();
        
        if(count % 2 != 0){
            long min = Arrays.stream(a).map(Math::abs).min().getAsLong();
            
            res-=min*2;
        }
        System.out.println(res);
    }
}
