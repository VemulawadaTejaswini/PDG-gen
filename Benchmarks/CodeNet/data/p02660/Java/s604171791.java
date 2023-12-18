import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        if (isPrime(n)) {
            System.out.println(1);
            return;
        }
        long num1 = 2;
        long num2 = 3;
        long ans = 0;
        while (n != 1) {
//            long temp = num2;
            List<Long> list = getDivisor(n);
            int idx = Collections.binarySearch(list, num1);
            if (idx <= 0) {
                idx = -idx - 1;
            }
            if (idx == list.size()) {
                break;
            }
            n /= list.get(idx);
            num1 = list.get(idx) + 1;
//                    if (n % num2 == 0) {
//                        n /= num2;
//                        num2 = nextPrime(num2);
//                        break;
//                    } else {
//                        num2 = nextPrime(num2);
//                    }
            ans++;
        }
        System.out.println(ans);
    }

    private static boolean isPrime(long n) {
        for (long i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }

    private static long nextPrime(long input) {
        int counter;
        input++;
        while (true) {
            int l = (int) Math.sqrt(input);
            counter = 0;
            for (int i = 2; i <= l; i++) {
                if (input % i == 0) {
                    counter++;
                }
            }
            if (counter == 0)
                return input;
            else {
                input++;
            }
        }
    }

    private static List<Long> getDivisor(long n) {
        List<Long> list = new ArrayList<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}