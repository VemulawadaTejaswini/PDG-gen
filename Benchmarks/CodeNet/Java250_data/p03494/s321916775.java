import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] a = new int[num];
        int cnt = 0;
        for (int i = 0; i < num; i++) {
            a[i] = s.nextInt();
        }

        while (allEven(a)) {
            division(a);
            cnt++;
        }
        System.out.println(cnt);
        s.close();
    }

    public static void division(int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i] /= 2;
        }
    }

    public static boolean allEven(int[] num) {
        int cnt = 0;
        boolean ret = false;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                cnt++;
            }
        }
        if (cnt == num.length) {
            ret = true;
        }
        return ret;
    }
}