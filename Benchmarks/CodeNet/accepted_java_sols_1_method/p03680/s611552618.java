import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean[] pushed = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            pushed[i] = false;
        }

        long count = 0;
        int i = 0;
        while (true) {
            if (pushed[i]) {
                System.out.println(-1);
                return;
            }
            count++;
            if (a[i] == 2) {
                break;
            }
            pushed[i] = true;
            i = a[i] - 1;
        }
        System.out.println(count);
    }

}
