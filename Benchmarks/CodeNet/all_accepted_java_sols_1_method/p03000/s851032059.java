import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int l[] = new int[n];
        int d[] = new int[n + 1];
        d[0] = 0;
        int x = stdIn.nextInt();
        for (int i = 0; i < l.length; i++) {
            l[i] = stdIn.nextInt();
        }
        int c = 1;
        for (int i = 0; i < l.length; i++) {
            d[i + 1] = d[i] + l[i];
            if (d[i + 1] > x)
                break;
            c++;
        }
        System.out.println(c);

    }
}
