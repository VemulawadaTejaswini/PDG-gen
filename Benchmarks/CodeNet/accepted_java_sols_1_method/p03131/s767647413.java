import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long k = sc.nextInt();
        long a = sc.nextInt();
        long b = sc.nextInt();
        long d = b-a;

        long r1 = 1 + k;

        long r2 = 0;
        if (a-1 <= k) {
            r2 = a;
            k -= (a-1);
            r2 = a + (k/2*d) + (k%2);
        }

        System.out.println(Math.max(r1, r2));

    }

}
