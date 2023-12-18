
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt(),w=sc.nextInt();
        int n=sc.nextInt();
        int sq = h*w;
        int m = Math.max(h,w);
        int ans;
        if(n%m==0)ans = n/m;
        else ans = n/m+1;
        System.out.println(ans);


    }
}
