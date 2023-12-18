import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[t];
        int max = 0;
        int rest = 0;
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
            rest += a[i];
            max = Math.max(max, a[i]);
        }
        rest -= max;
        if (rest >= max - 1) {
            System.out.println(0);
            return;
        }
        System.out.println(max - rest - 1);
    }

}
