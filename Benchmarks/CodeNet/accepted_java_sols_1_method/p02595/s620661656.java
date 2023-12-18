import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextInt();
        d *= d;
        int res = 0;
        for(int i=0; i<n; i++) {
            long x = sc.nextInt();
            long y = sc.nextInt();
            long a = x * x + y * y;
            if(a <= d) res++;

        }
        System.out.println(res);
    }



}