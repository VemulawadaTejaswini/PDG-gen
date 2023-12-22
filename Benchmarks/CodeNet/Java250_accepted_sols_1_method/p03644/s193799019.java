import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int tmp = 0;
        int count = 0;
        int maxCount = 0;
        int result = 0;

        for (int i = 1; i <= N; i++) {
            tmp = i;
            while (tmp > 0) {
                tmp = tmp / 2;
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                result = i;
            }
            tmp = 0;
            count = 0;
        }
        PrintWriter out = new PrintWriter(System.out);
        out.println(result);
        out.flush();
        sc.close();
    }
}