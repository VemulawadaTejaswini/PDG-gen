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
        
        A = A + V*T;
        B = B + W*T;
        //System.out.println(A+":"+B);
        
        if(A >= B){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}