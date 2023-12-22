import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        long ans = Integer.MAX_VALUE;
        for(int i=0;i<=x;i++){
            long now = a*i;
            now += (x-i)*2*c;
            int remB = Math.max(0,y-(x-i));
            now += Math.min(remB*b,remB*2*c);
            ans = Math.min(now,ans);
        }
        System.out.println(ans);
    }
}