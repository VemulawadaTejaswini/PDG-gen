import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nmin = scan.nextInt();
        int nmax = scan.nextInt();
        int scores[];
        int maxdif;
        int result = 0;
        while (!(n == 0 && nmin == 0 && nmax == 0)) {
            maxdif = 0;
            scores = new int[n];
            for (int i = 0; i < n; i++) {
                scores[i] = scan.nextInt();
            }
            for (int i = nmin - 1; i < nmax; i++) {
                if (scores[i] - scores[i + 1] >= maxdif) {
                    maxdif = scores[i] - scores[i + 1];
                    result = i+1;
                }
            }
            System.out.println(result);
            n = scan.nextInt();
            nmin = scan.nextInt();
            nmax = scan.nextInt();
        }
    }
}