
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] a = new int [n];
        for (int i = 0 ; i < n ; i++ ) {
            a[sc.nextInt() - 1]++;
        }
        Arrays.sort(a);

        //最初に何種類のボールがあるかを計算
        int ball = 0;
        for (int i = 0 ; i < n ; i++ ) {
            if (a[i] > 0) {
                ball++;
            }
        }

        int changedBall = 0;
        int cursol = 0;
        while (ball > k) {
            changedBall += a[cursol];
            if (a[cursol] > 0) {
                ball--;

            }
            cursol++;
        }
        System.out.println(changedBall);
    }

}