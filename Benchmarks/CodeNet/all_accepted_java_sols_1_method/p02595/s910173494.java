import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long n = scan.nextLong(), d = scan.nextLong(), cnt = 0;
        long x[] = new long[(int)n], y[] = new long[(int)n];
        for(int i = 0; i < x.length; i++) {
            x[i] = scan.nextLong();
            y[i] = scan.nextLong();

            if(x[i] * x[i] + y[i] * y[i] <= d * d) {
                cnt ++;
            }
        }

        System.out.println(cnt);

        scan.close();
        return;
    }
}