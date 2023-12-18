import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long d = sc.nextLong();

        long dis = d * d;

        long ans = 0;

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            if (x*x + y*y <= dis) {
                ans++;
            }

        }

        System.out.println(ans);



        sc.close();

        }

    }

