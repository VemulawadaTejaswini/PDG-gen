import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[1000001];
        a[1] = 7 % k;
        for (int i = 2; i <= k; i++) {
            a[i] = (a[i - 1] * 10 + 7) % k;
        }
        for (int i = 1; i <= k; i++) {
            if (a[i] == 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }

}
