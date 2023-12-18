import java.util.*;
public class Main{

     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n<1000) {
            int res = n-1000;
            System.out.println(res);
        }
        
        int ans = 1000-(n%1000);
        
        System.out.println(ans);
     }
}