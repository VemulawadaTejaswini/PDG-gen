import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        BitSet master = new BitSet(m);
        master.set(1, m + 1);
        for (int i = 0; i < n; ++i) {
            int k = scan.nextInt();

            BitSet bitset = new BitSet(m);
            for (int j = 0; j < k; ++j) {
                bitset.set(scan.nextInt());
            }
            master.and(bitset);
        }
        System.out.println(master.cardinality());
    }
}