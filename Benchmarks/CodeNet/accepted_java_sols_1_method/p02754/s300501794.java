import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N=sc.nextLong(),A=sc.nextLong(),B=sc.nextLong();
        sc.close();
        long ans=(N/(A+B))*A;
        if(N%(A+B)<A) ans+=N%(A+B);
        else ans+=A;
        System.out.println(ans);
    }
}
