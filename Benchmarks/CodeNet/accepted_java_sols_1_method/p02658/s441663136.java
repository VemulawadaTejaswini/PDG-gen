import java.util.*;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] a = new long[N];
        long MAX = (long)Math.pow(10,18);
        long ans = 1;
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextLong();
            if(a[i] == 0){
                System.out.println(0);
                return;
            }
        }
        for(int i=0; i<N; i++){
            if(MAX/ans < a[i]){
                System.out.println(-1);
                return;
            }else{
                ans *= a[i];
                //System.out.println(ans);
            }
        }
        System.out.println(ans);
    }
}