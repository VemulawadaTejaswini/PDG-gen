import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(solve(n));
        
     }
     
     public static int solve(int n) {
         int res = 0;
         if(n<1000) {
             res = 1000-n;
            return res;
        }
        
        if(n%1000==0) {
            return 0;
        }
        
        res = 1000-(n%1000);
        
        return res;
     }
}