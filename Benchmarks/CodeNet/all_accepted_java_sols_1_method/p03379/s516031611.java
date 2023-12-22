import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] al = new long[n];
        long[] sl = new long[n];
        for(int i = 0; i < n; i++){
            al[i] = sc.nextLong();
            sl[i] = al[i];
        }
        Arrays.sort(sl);
        long upper = sl[n/2];
        long lower = sl[n/2-1];
        for(long a : al){
            if(a >= upper){
                System.out.println(lower);
            }else{
                System.out.println(upper);
            }
        }
        
    }
    
}