import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        
        int X;
        
        if(A > B){
            X = A;
            A = B;
            B = X;
        }
        
        if(B > C){
            X = B;
            B = C;
            C = X;
        }
        
        for(int i = 0; i < K; i++){
            C = C * 2;
        }
        
       System.out.println(A + B + C);
    }
}