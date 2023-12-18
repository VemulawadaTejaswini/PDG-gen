import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int x[] = new int[100];
        int y[] = new int[100];
        int a = 1;
        int b = 1;
        int cnt = 0;
        while (a != 0 || b != 0) {
            Scanner scan = new Scanner(System.in);
            a = scan.nextInt();
            b = scan.nextInt();
            x[cnt] = a;
            y[cnt] = b;
            cnt++;

        }

        for (int i = 0; i < cnt - 1; i++) {
            if (x[i] > y[i]) {
                int c = 0;
                c = x[i];
                x[i] = y[i];
                y[i] = c;
            }
            System.out.println(x[i] + " " + y[i]);
        }
    }
}