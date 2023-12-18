import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        if(X <= Y){
            System.out.println(Math.min(A*X + B*Y, 
                                Math.min(2*C*X + (Y-X)*B, 
                                        2*C*Y)));

        } else {
            System.out.println(Math.min(A*X + B*Y, 
                                Math.min(2*C*Y + (X-Y)*A, 
                                        2*C*X)));
        }
    }
}