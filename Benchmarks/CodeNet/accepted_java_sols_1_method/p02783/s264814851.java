import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static int MOD = 1000000007;


    public static void main(String[] args) {

        //int ans=Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int a =sc.nextInt();
        int ans;
        if(h%a==0)ans=h/a;
        else ans=h/a+1;

        System.out.println(ans);






    }


}
