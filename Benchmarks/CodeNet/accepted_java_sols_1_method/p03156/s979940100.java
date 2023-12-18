
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0 ; i < n ; i++) {
            p[i] = sc.nextInt();
        }
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;
        for (int i = 0 ; i < n ; i++) {
            if (p[i] <= a) {
                s1++;
            } else if (p[i] > a && p[i] <= b) {
                s2++;
            } else {
                s3++;
            }
        }
        System.out.println(Math.min(s1, Math.min(s2, s3)));
    }

}
