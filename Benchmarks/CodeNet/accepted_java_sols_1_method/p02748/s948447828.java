import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int[] a = new int[A];
        int[] b = new int[B];
        int aans = 99999999;
        int bans = 99999999;
        int ans = 0;
        for(int i=0;i<A;i++){
            a[i] = scan.nextInt();
            aans = Math.min(aans, a[i]);
        }

        for(int i=0;i<B;i++){
            b[i] = scan.nextInt();
            bans = Math.min(bans, b[i]);
        }

        ans = aans+bans;

        for(int i=0;i<C;i++){
            int o = scan.nextInt();
            int p = scan.nextInt();
            int q = scan.nextInt();
            ans = Math.min(ans, a[o-1]+b[p-1]-q);
        }

        System.out.println(ans);
    }
}
