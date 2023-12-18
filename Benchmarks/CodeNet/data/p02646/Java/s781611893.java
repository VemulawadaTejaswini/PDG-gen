import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        int A = sc.nextInt();
        int V = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();
        boolean test = true;
        
        if(A<B){
            A = A + V*T;
            B = B + W*T;
            
            if(A >= B){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            A = A + V*T*(-1);
            B = B + W*T*(-1);
        
            if(A <= B){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        //System.out.println(A+":"+B);
    }
}