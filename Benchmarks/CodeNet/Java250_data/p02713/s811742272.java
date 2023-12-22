import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int K;
        int a,b,c;
        try (Scanner sc = new Scanner(System.in)) {
            K = sc.nextInt();
        }
        a = b = c =  K;
        long result = 0;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    long temp = gcd((long)i,(long)j);
                    temp = gcd(temp,(long)k);
                    result += temp;
                }
            }
        }
        System.out.println(result);
    }

    //最大公約数
    static long gcd(long a, long b) {
        long temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return (long) b;
    }
}
