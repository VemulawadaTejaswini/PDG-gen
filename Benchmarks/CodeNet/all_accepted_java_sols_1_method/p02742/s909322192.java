import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        long sum = H*W;
        long ans = 0;
        
        if(H==1 || W == 1){
            ans = 1;
        }else if(sum%2 == 0){
            ans = (long)sum/2;
        }else{
            ans = (long)sum/2+1;
        }
        
        System.out.println(ans);
   }
}
