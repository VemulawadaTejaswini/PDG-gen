import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        long n=in.nextLong();
        while (true) {
            int cnt=0;
            for (int i=2; i*i<=n; i++) {
                if (n%i==0) {
                    cnt++; break;
                }
            }
            if (cnt==0) {
                System.out.println(n);
                return ;
            }
            n+=(n%2)+1;
        }
     }
}
