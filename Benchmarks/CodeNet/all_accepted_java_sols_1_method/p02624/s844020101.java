import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner c = new Scanner(System.in);
        int n = c.nextInt();
        long k = 0;
        for(int i=1;i<=n;i++) {
            long s = n/i;
            k+=(s+1)*i*s/2;
        }
        System.out.println(k);
    }
}
