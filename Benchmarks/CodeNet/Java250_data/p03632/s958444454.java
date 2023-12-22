import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int[] ab = new int[100+1];
        int[] cd = new int[100+1];
        for (int i = a; i <= b; i++) {
            ab[i] = 1;
        }
        for (int i = c; i <= d; i++) {
            cd[i] = 1;
        }

        int e = 0;
        for (int i = 0; i <= 100; i++) {
            if (ab[i] == 1 && cd[i] == 1) {
                e += 1;
            }
        }
        if (e >= 1) {
            e -= 1;
        }

        System.out.println(e);
    }

}