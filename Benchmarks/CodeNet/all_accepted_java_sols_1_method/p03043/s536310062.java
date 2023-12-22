import java.util.*;

public class Main {

    private static Map<Integer, Double> map = new HashMap<>();

    static {
        map.put(1, 2.0);
        map.put(2, 4.0);
        map.put(3, 8.0);
        map.put(4, 16.0);
        map.put(5, 32.0);
        map.put(6, 64.0);
        map.put(7, 128.0);
        map.put(8, 256.0);
        map.put(9, 512.0);
        map.put(10, 1024.0);
        map.put(11, 2048.0);
        map.put(12, 4096.0);
        map.put(13, 8192.0);
        map.put(14, 16384.0);
        map.put(15, 32768.0);
        map.put(16, 65536.0);
        map.put(17, 131072.0);
    }

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        double ans = 0.0;

        for (int a = 1; a <= N; a++) {
            int n = 0;
            int t = a;
            while (t < K) {
                n++;
                t *= 2;
            }
            if (n != 0) {
                ans += 1.0 / N * Math.pow(0.50, (double) n);
            } else {
                ans += 1.0 / N;
            }
        }

//        for (int a = 1; a <= N; a++) {
//            double c1 = (double) (a + K) / a;
//            System.out.println("c1:"+c1);
//            int mapIdx = 0;
//            for (int i = 1; i <= 16; i++) {
//                if (map.get(i) < c1) {
//                    continue;
//                } else {
//                    mapIdx = i;
//                    break;
//                }
//            }
//            System.out.println("mapIdx:"+mapIdx);
//            if (mapIdx != 0) {
//                ans += 1.0 / N * Math.pow(0.5, (double) mapIdx);
//            } else {
//                ans += 1.0 / N;
//            }
//        }

        System.out.println(ans);

//        System.out.println(System.currentTimeMillis() - startTime);
    }


}
