import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        long[] h = new long[N];
        
        int cnth = 0;
        for(int i = 0; i < N; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextLong();
            if(h[i] > 0){
                cnth++;
            }
        }

        boolean bl = false;
        int ansx = 0;
        int ansy = 0;
        long ansh = 0;
        for(int cx = 0; cx <= 100; cx++){
            for(int cy = 0; cy <= 100; cy++){
                bl = true;
                int index = -1;
                for(int i = 0; i < N; i++){
                    if(h[i] > 0){
                        index = i;
                    }
                }

                long H = h[index] + Math.abs(x[index] - cx) + Math.abs(y[index] - cy);

                for(int i = 0; i < N; i++){
                    if( h[i] != Math.max(0, H -  Math.abs(x[i] - cx) - Math.abs(y[i] - cy))){
                        bl = false;
                        break;
                    }
                }
                if(bl == true){
                    ansx = cx;
                    ansy = cy;
                    ansh = H;
                    break;
                }
            }
        }
        System.out.println(ansx + " " + ansy + " " + ansh);
    }
}
