import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long d = sc.nextLong();
        long D = d * d;
        int res = 0;
        for(int i = 0; i < n; i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            if(x * x + y * y > D)
                continue;
            else
                res++;
        }
        System.out.println(res);
    }
}