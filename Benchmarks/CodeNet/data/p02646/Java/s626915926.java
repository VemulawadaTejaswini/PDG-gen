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
        
        if(V<=W){
            System.out.println("NO");
        }else{
            int L = Math.abs(A-B);
            int S = V - W;
            if(L%S==0 && L/S <= T){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            //System.out.println(A+":"+B+":"+L);
        }
    }
}