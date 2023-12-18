import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
         if(n<k){
            n = Math.min(n,k-n);
        }
        long ans = n;
       
        if(k<=n) ans = Math.min(n%k,k-(n%k));
        System.out.println(ans);
       
     }
}