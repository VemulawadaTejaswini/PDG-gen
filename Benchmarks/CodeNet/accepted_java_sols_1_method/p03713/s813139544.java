import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long H = sc.nextLong();
        long W = sc.nextLong();
        if(H%3 == 0 || W%3 == 0){
            System.out.println(0);
            return;
        }
        long ans = Math.min(H, W);
        for(long h = 1;h < H;h++){
            long l = 1;
            long h1 = Math.max(h, H-h);
            long h2 = Math.min(h, H-h);
            long d = H*(W-(long)1)-h1;
            l += d/(H+h1);
            ans = Math.min(ans, H*(W-l)-h2*l);
            l++;
            long a = Math.min(h2*l, H*(W-l));
            ans = Math.min(ans, h1*l-a);
            long c = Math.max(Math.abs((H-h)*W-h*(W/2)), Math.abs((H-h)*W-h*((W+(long)1)/2)));
            c = Math.max(c, h*((W+(long)1)/2)-h*(W/2));
            ans = Math.min(ans, c);
        }
        System.out.println(ans);
    }
}