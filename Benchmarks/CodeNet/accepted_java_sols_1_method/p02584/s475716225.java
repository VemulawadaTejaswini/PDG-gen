import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = Math.abs(sc.nextLong());
        long k = sc.nextLong();
        long d = sc.nextLong();

        long ans = 0;
        if(x/d>=k) {
            System.out.println(x - d*k);
        } else {
            long nk = k - x/d;
            long nx = x % d;
            if(nk%2==0) System.out.println(nx);
            else System.out.println(Math.abs(nx-d));
        }
    }
}
