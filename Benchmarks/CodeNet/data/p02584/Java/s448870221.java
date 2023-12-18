import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        long X,K,D;
        Scanner sc = new Scanner(System.in);
        
        X = sc.nextLong();
        K = sc.nextLong();
        D = sc.nextLong();
        
        
        long Xa = Math.abs(X);
        long ans = 0;
        
        long n = Xa / D;
        
        if(n > K) {
            ans = Xa - K*D;
            
        }
        
        else {
            if((Xa - n*D) > -(Xa-(n+1)*D)) {
                if((K-(n+1))%2==0)
                    ans = -(Xa-(n+1)*D);
                else
                    ans = (Xa - n*D);
            }
            else {
                if((K-(n))%2==0)
                    ans = (Xa - n*D); 
                else
                    ans = -(Xa-(n+1)*D);
                
            }
        }    
        //ans *=  (X<0?-1:1);
        System.out.println(ans);
         
     }
}