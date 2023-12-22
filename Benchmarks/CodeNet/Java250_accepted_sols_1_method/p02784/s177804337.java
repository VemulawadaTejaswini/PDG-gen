import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int N = sc.nextInt();
        sc.nextLine();
        int sumA = 0;
        for (int i = 0; i < N; i++) {
            sumA += sc.nextInt();
        }
        System.out.println(sumA >= H ? "Yes" : "No");
    }
}