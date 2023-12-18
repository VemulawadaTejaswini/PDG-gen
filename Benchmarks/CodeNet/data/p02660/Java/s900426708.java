import java.util.HashMap;
import java.util.Map;
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
        Map<Long, Long> map = getPf(n);
        long ans = 0;
        for (Map.Entry<Long, Long> e : map.entrySet()) {
            int temp = 1;
            long temp2 = e.getValue();
            while (true) {
                if (temp > temp2) {
                    break;
                }
                temp2 -= temp;
                temp++;
                ans++;
            }
        }
//        long num1 = 2;
//        long num2 = 2;
//        f:while (n != 1) {
////            long temp = num2;
//            List<Long> list = getDivisor(n);
//            long num;
//            while (true) {
//                int idx = Collections.binarySearch(list, num1);
//                if (idx <= 0) {
//                    idx = -idx - 1;
//                }
//                if (idx == list.size()) {
//                    break f;
//                }
//                num = list.get(idx);
//                if (num % 2 == 0 && num < num2) {
//                    num1 = num + 1;
//                    continue;
//                }
//                break;
//            }
//            n /= num;
//            if (num % 2 == 0) {
//                num2 = num * 2;
//            }
//            num1 = num + 1;
//                    if (n % num2 == 0) {
//                        n /= num2;
//                        num2 = nextPrime(num2);
//                        break;
//                    } else {
//                        num2 = nextPrime(num2);
//                    }
//            ans++;
//        }
        System.out.println(ans);
    }
//
    private static boolean isPrime(long n) {
        for (long i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n != 1;
    }
//
//    private static long nextPrime(long input) {
//        int counter;
//        input++;
//        while (true) {
//            int l = (int) Math.sqrt(input);
//            counter = 0;
//            for (int i = 2; i <= l; i++) {
//                if (input % i == 0) {
//                    counter++;
//                }
//            }
//            if (counter == 0)
//                return input;
//            else {
//                input++;
//            }
//        }
//    }
//
//    private static List<Long> getDivisor(long n) {
//        List<Long> list = new ArrayList<>();
//        for (long i = 1; i * i <= n; i++) {
//            if (n % i == 0) {
//                list.add(i);
//                if (n / i != i) {
//                    list.add(n / i);
//                }
//            }
//        }
//        Collections.sort(list);
//        return list;
//    }

    private static Map<Long, Long> getPf(long n) {
        Map<Long, Long> map = new HashMap<>();
        for (long i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                map.merge(i, 1L, Long::sum);
                n /= i;
            }
        }
        if (n != 1) {
            map.put(n, 1L);
        }
        return map;
    }
}