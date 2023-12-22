import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long ct = 0;
        long cx = 0; 
        long cy = 0;
        boolean ans = true;
        for(int i = 0;i < N;i++){
            long ti = (long)sc.nextInt();
            long xi = (long)sc.nextInt();
            long yi = (long)sc.nextInt();
            long di = Math.abs(xi-cx)+Math.abs(yi-cy);
            if(ti-ct < di || (ti-ct)%2 != di%2){
                ans = false;
            }
            ct = ti;
            cx = xi;
            cy = yi;
        }
        if(ans) System.out.println("Yes");
        else    System.out.println("No");
    }
}