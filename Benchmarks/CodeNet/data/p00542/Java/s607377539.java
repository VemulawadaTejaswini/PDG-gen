
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a[];
        a = new int[6];
        int Min = 101;
        int total = 0;
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) { //理科系科目

            if (Min > a[i]) {
                Min = a[i];
            }
            total += a[i];

            if (i == 3) {

                total = total - Min;

            }
        }
        if (a[4] < a[5]) {
            System.out.println(total + a[5]);

        } else {
            System.out.println(total + a[4]);
        }

    }
}

