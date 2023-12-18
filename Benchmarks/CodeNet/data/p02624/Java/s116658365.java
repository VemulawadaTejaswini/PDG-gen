import java.util.*;

public class Main{
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        long n = Integer.parseInt(sc.next());
        
        long ans = n*(n+1)/2;
        for(int i=2; i<=(int)1e7; i++){
            //System.out.println(ans);
            long tmp = n/i;
            tmp = tmp*(tmp+1)/2*i;
            ans += tmp;
        }
        
        System.out.println(ans);
    }
    
}
