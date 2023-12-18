import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] primeList = new int[1229];
        boolean[] p = new boolean[10000];
        int limit = 10000;
        primeList[0] = 2;
        primeList[1] = 3;
        p[3] = true;
        int count = 2;
        for (int i = 5; i <= limit; i += 2) {
            boolean wflag = true;
            for (int j = 1; primeList[j] * primeList[j] <= i; j++) {
                if (i % primeList[j] == 0) {
                    wflag = false;
                    break;
                }
            }
            if (wflag) {
                primeList[count++] = i;
                p[i] = true;
            }
        }
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            n = n % 2 == 0 ? n - 1 : n;
            for (int i = n; i >= 5; i -= 2) {
                if (p[i] && p[i - 2]) {
                    System.out.println(i - 2 + " " + i);
                    break;
                }
            }
        }
    }
}

