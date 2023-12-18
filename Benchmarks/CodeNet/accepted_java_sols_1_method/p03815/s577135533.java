import java.util.*;

public class Main {

    static int MOD = 1000000007;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long ans=0;



        ans = x/11*2;
        if(x%11==0);
        else if(x%11<7)ans++;
        else ans +=2;

        System.out.println(ans);

    }

}
