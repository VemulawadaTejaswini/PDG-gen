import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sleep[];
        sleep = new int[N];
        int tmp = 0;
        boolean hantei = true;
        for (int i = 0; N > i; i++) {
            int A = sc.nextInt();
            sleep[i] = A;
        }
        while (hantei) {
            for (int j = 0; N > j; j++) {
                if (sleep[j] % 2 == 0) {
                    sleep[j] = sleep[j] / 2;
                } else {
                    hantei = false;
                    break;

                }
            }
            if (hantei == true) {
                tmp++;
            }
        }
        System.out.println(tmp);
    }
}