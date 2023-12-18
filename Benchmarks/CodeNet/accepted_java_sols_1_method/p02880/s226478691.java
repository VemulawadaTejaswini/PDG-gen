import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = i; j < 9; j++) {
                set.add(a[i] * a[j]);
            }
        }
        if (set.contains(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}