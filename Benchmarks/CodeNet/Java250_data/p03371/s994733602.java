import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int A = sc. nextInt();
        int B = sc. nextInt();
        int C = sc. nextInt();
        
        int X = sc. nextInt();
        int Y = sc. nextInt();
        
        boolean Aflag = X > Y;
        
        int Z = 0;
        
        if (Aflag){ 
            Z = X - Math.abs(X-Y);
        }else{
            Z = Y - Math.abs(X-Y);
        }
        
        long price = 0;
        
        if ((A+B) > C*2){
            price += Z*C*2;
            if (Aflag){
                if (A < 2*C){
                    price += (X-Z)*A;
                }else{
                    price += (X-Z)*2*C;
                }
            }else{
                if (B < 2*C){
                    price += (Y-Z)*B;
                }else{
                    price += (Y-Z)*2*C;
                }
            }
            
        }else{
            price += A*X;
            price += B*Y;
        }
        
        System.out.println(price);
    }
}
