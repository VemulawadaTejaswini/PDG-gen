import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object o = run();
        if (o != null)
            System.out.println(o);
    }

    static Object run() {
        try (Scanner sc = new Scanner(System.in)) {


            // 文字列
            // String s = sc.next();
            // String ? = sc.next();

            // 整数
            int a = sc.nextInt() + 1;
            // int x = sc.nextInt();
            // int d = sc.nextInt();

            // 文字列列
            // String[] ? = ChenAtCoderUtil.nScan(sc, n);
            // String[] ? = ChenAtCoderUtil.nScan(sc, n);

            // 整数列
            // int[] a = ChenAtCoderUtil.nScanInt(sc, n);
            // int[] ? = ChenAtCoderUtil.nScanInt(sc, n);

            // 二次元整数列
            // int[][] ? = ChenAtCoderUtil.nScanInt2(sc, n, m);

            // ペア整数列
            // Pair<int[], int[]> pair = ChenAtCoderUtil.nScanPair(sc, n);
            // int[] ? = pair.getKey();
            // int[] ? = pair.getValue();


            // for (int i = 0; i < n; i++) {
            //
            // }

            int[] result = new int[a];
            int yFloor = 1;
            int zFloor = 1;
            for (int x = 1; x*x < a; x++) {
                for (int y = yFloor; y*y < a; y++) {
                    for (int z = zFloor; z*z < a; z++) {
                        int t = x*x + y*y + z*z + x*y + y*z + z*x;
                        if (t > a) {
                            break;
                        }
                        if (x+y+z != 3) {
                            result[t] += 3;
                        } else {
                            result[t]++;
                        }
                    }
                    zFloor++;
                }
                yFloor++;
            }

            for (int i = 1; i < a; i++) {
                System.out.println(result[i]);
            }

            return null;
        }
    }
}

class ChenNumberUtil {
    static Collection<Integer> getDivisors(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                al.add(i);
                if (n / i != i)
                    al.add(n / i);
            }
        }
        Collections.sort(al);
        return al;
    }
}

class ChenAtCoderUtil {
    static int[] nScanInt(Scanner sc, int n) {
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        return list;
    }

    static long[] nScanLong(Scanner sc, int n) {
        long[] list = new long[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLong();
        }
        return list;
    }

    static double[] nScanDouble(Scanner sc, int n) {
        double[] list = new double[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextDouble();
        }
        return list;
    }

    static String[] nScan(Scanner sc, int n) {
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.next();
        }
        return list;
    }

    static String[] nScanLine(Scanner sc, int n) {
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextLine();
        }
        return list;
    }

    static Pair<int[], int[]> nScanPair(Scanner sc, int n) {
        Pair<int[], int[]> list = new Pair<>(new int[n], new int[n]);
        for (int i = 0; i < n; i++) {
            list.getKey()[i] = sc.nextInt();
            list.getValue()[i] = sc.nextInt();
        }
        return list;
    }

    static int[][] nScanInt2(Scanner sc, int n, int m) {
        int[][] list = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list[i][j] = sc.nextInt();
                list[i][j] = sc.nextInt();
            }
        }
        return list;
    }

    static long[][] nScanLong2(Scanner sc, int n, int m) {
        long[][] list = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                list[i][j] = sc.nextInt();
                list[i][j] = sc.nextInt();
            }
        }
        return list;
    }
}

class Pair<K, V> implements Entry<K, V>, java.io.Serializable {
    private static final long serialVersionUID = -8499721149061103585L;

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Pair(Entry<? extends K, ? extends V> entry) {
        this.key = entry.getKey();
        this.value = entry.getValue();
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public K setKey(K key) {
        K oldKey = this.key;
        this.key = key;
        return oldKey;
    }

    public V setValue(V value) {
        V oldValue = this.value;
        this.value = value;
        return oldValue;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Map.Entry))
            return false;
        Map.Entry<?, ?> e = (Map.Entry<?, ?>) o;
        return eq(key, e.getKey()) && eq(value, e.getValue());
    }

    public int hashCode() {
        return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
    }

    public String toString() {
        return key + "=" + value;
    }

    private static boolean eq(Object o1, Object o2) {
        return o1 == null ? o2 == null : o1.equals(o2);
    }
}
