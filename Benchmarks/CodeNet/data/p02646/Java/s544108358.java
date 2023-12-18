import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //String str = sc.next();
        int A = sc.nextInt();
        int V = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt();
        long T = sc.nextInt();
        boolean test = true;
        
        if(V<=W){
            System.out.println("NO");
        }else{
            long L = Math.abs(A-B);
            long S = V - W;
            if(L%S==0 && L/S <= T){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            //System.out.println(A+":"+B+":"+L);
        }
    }
}