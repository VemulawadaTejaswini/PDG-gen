import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int W = sc.nextInt();
        int H = sc.nextInt();
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] a = new int[N];
        int wl = 0;
        int wr = W;
        int ht = H;
        int hb = 0;

        for(int i=0; i<N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            if(a[i]==1){
                wl = Math.max(wl, x[i]);
            }
            else if(a[i]==2){
                wr = Math.min(wr, x[i]);
            }
            else if(a[i]==3){
                hb = Math.max (hb, y[i]);
            }
            else{
                ht = Math.min(ht, y[i]);
            }
        }
        if(wl<wr && hb<ht){
            System.out.println((wr - wl) * (ht - hb));
        }
        else{
            System.out.println(0);
        }

    }
}