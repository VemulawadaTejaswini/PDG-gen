import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        int sum;
        int SUM = 0;

        for (Integer i = 0; i < Integer.parseInt(N) + 1; i++) {
            sum = 0;
            for (Integer j = 0; j < i.toString().length(); j++) {
                sum += Integer.parseInt(i.toString().split("")[j]);
            }
            if (sum >= A && sum <= B)
                SUM += i;
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(SUM);

        sc.close();
        out.flush();
    }
}
