import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long ans = 0;
        for(int i=1;i<=n;i++) {
            long a = n%i;
            long s = n/i;
            ans+=(i+n-a)*s/2;
        }
        System.out.println(ans);
    }
}