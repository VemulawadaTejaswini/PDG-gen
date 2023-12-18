import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        long n = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long r = Long.parseLong(sc.next());
        
        long br=b+r;
        if(br >0){
                
            long sum=(n/br);
            sum *= b;
            long rest=n%br;
            if(rest>b) sum+=b;
            else sum+=rest;
            
            
            //String s = sc.next();
            System.out.println(sum);
        }else{
            System.out.println(0);
        }
    }
    
}