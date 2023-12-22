import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        int ans = 0;
        for (int i = 0; i < 5; i++) {
            int tmp = (a[i] / 10) * 10;
            if (a[i] % 10 != 0) {
                tmp += 10;
            }
//            System.out.println(tmp);
            ans += tmp;
        }
//        System.out.println(ans);

        int diff = 0;
        for (int i = 0; i < 5; i++) {
            if (a[i] % 10 != 0) {
                int tmp = 10 - (a[i] % 10);
                if (tmp > diff) {
                    diff = tmp;
                }
            }
        }

        ans -= diff;
        System.out.println(ans);
    }

}
