import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Set<Integer> s = new HashSet<>();
        int gold = 0;
        for (int i = 0; i < n; i++) {
            int rank = a[i];
            if (rank < 3200) {
                s.add(rank / 400);
            } else {
                gold++;
            }
        }

        // 全部が3200以上だったら1種類
        int min = s.size() == 0 ? 1 : s.size();

        // 9種類以上の色もあるっぽい？
        int max = s.size() + gold;

        System.out.printf("%s %s\n", min, max);
    }
}
