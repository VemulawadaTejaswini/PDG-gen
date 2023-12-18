import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] pow3 = new int[16], c = new int[16];
        int n, m, i, j, k, d, x, y, p;
        pow3[0] = 1;
        for(i = 1; i <= 15; ++i)
        {
        pow3[i] = pow3[i-1] * 3;
        }
        while(true){
            n = in.nextInt();
            m = in.nextInt();
            if(n == 0 && m == 0)break;
            for(i = 0;i<3;i++){
                for(j = in.nextInt(); j > 0; --j){
                    k = in.nextInt();
                    c[n-k] = i;
                }
            }
            
            p = 0;
            x = 0;
            for(i = n - 1; i >= 0; --i){
                d = Math.abs(p - c[i]);
                x += pow3[i] * d;
                if(d == 1) p = 2 - p;
            }
            y = pow3[n] - 1 - x;
            if(x > y) x = y;
            if(m < x) System.out.println("-1");
            else System.out.println(x);
        }
        in.close();
    }
}

