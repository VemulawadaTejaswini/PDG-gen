import java.util.*;

public class Main {

    public static void main(String args []) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        long[] list = new long[n];
        long sum = 0;
        long mod = 1000000007;

        for (int i = 0; i<n; i++) {
            long a = scan.nextLong();
            list[i] = a;
        }

        for (int i = 0; i<n - 1; i++) {


            for (int j = i + 1; j<n; j++) {

                long a = list[i] * list[j] % mod;
                sum = (a + sum) % mod;
            }
        }
//
//        long a = sum % 1000000007;

//        String string = String.valueOf(sum);
//
//        if (string.length() < 10) {
//
//            System.out.println(Long.valueOf(string));
//        } else {
//            long a = Long.valueOf(string.substring(string.length() - 10));
//
//        }

        System.out.println(sum);

    }
}
