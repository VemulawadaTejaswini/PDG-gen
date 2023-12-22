import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] a = new int[N];
        int temp = 0;
        int count = 0;

        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < N; i++) {

            if (a[i] == 2) {
                count++;
                break;
            } else if (a[i] == 1 || a[i] == -1) {
                count = -1;
                break;
            }

            temp = i;
            i = a[i] - 2;
            a[temp] = -1;
            count++;
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(count);
        sc.close();
        out.flush();
    }
}