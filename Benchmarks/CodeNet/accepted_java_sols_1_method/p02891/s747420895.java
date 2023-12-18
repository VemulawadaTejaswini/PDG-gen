import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        long K = sc.nextLong();
        int n = S.length();

        int i = 0;
        while (i + 1 < n && S.charAt(i + 1) == S.charAt(0)) i++;

        long firstPart = (i + 1) / 2;

        if (i == n - 1) {
            System.out.println((K * n) / 2);
            return;
        }

        int j = n - 1;
        while (j - 1 >= 0 && S.charAt(j - 1) == S.charAt(n - 1)) j--;
        long lastPart = (n - j) / 2;

        long middle = 0;
        for (int k = i + 1; k < j; k++) {
            int l = k;
            while (l + 1 < j && S.charAt(l + 1) == S.charAt(k)) l++;
            middle += (l - k + 1) / 2;
            k = l;
        }

        long overlap = 0;
        if (S.charAt(0) == S.charAt(n - 1)) {
            overlap = (n - j + i + 1) / 2;
        }

        long sol = 0;
        if (overlap > 0) {
            sol = (K - 1) * overlap + K * middle + firstPart + lastPart;
        } else {
            sol = K * (firstPart + middle + lastPart);
        }

        System.out.println(sol);
    }
}
