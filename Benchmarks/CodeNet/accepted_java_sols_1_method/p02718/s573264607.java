import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_n = sc.nextInt();
        int select_m = sc.nextInt();
        int a[] = new int[total_n];

        double vote_count = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            vote_count += a[i];
        }

        int count_valid = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= vote_count * (1 / (4.0 * ((double) select_m)))) {
                count_valid++;
            }
        }

        if (count_valid >= select_m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}