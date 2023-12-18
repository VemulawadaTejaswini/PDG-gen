import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.nextLine();
        int[] H = new int[N];
        for (int i = 0; i < H.length; i++) {
            H[i] = sc.nextInt();
        }
        if (K >= N) {
            System.out.println(0);
            return;
        }
        Arrays.sort(H);
        long sumA = 0;
        for (int i = N - K - 1; i >= 0; i--) {
            sumA += H[i];
        }
        System.out.println(sumA);
    }
}