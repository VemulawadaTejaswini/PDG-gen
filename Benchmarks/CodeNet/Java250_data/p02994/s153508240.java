import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int nPi = 0;
        for (int i = 1; i <= n; i++) {
            nPi += l + i - 1;
        }
        int minDiff = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            int n1Pi = nPi - (l + i - 1);
            int diff = Math.abs(nPi - n1Pi);
            if (minDiff > diff) {
                minDiff = diff;
                result = n1Pi;
            }
        }
        System.out.println(result);
    }

}
