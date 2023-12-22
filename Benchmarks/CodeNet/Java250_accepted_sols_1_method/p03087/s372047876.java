import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        int acnum[] = new int[n];
        Arrays.fill(acnum, 0);
        for (int i = 0; i < n - 1; i++) {
            String tmp = s.substring(i, i + 2);
            if (tmp.equals("AC")) {
                acnum[i]++;
            }
        }
        for (int i = 0; i < n - 1; i++) {
            acnum[i + 1] += acnum[i];
        }

        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = 0;
            if (l == 1) {
                ans = acnum[r - 2];
            } else {
                ans = acnum[r - 2] - acnum[l - 2];
            }
            System.out.println(ans);
        }

        sc.close();
    }
}
