import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a,b,c,k;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        k = sc.nextInt();
        
        int sn = 0 ;
        
        if(a<=k){
            sn += a*1;
            k -= a;
        }
        else{
            sn += k;
            k -= k;
        }
        
        if(b<=k){
            sn += 0;
            k -= b;
        }
        else{
            k -= k;
        }
        
        if(c<=k){
            sn -= 1*c;
            k -= c;
        }
        else{
            sn -= k;
            k -= k;
        }
        
        System.out.println(sn);
        
    }
}

