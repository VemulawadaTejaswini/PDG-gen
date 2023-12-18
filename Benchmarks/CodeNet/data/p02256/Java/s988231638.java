

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = (int)gcd(a,b);
        System.out.println(res);

    }
    public static long gcd(long a, long b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}

