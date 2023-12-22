import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    private static final PrintStream so = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];
        int before = 0;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int color = sc.nextInt();
            
            if (color == before) {
                count++;
            } else {
                sum += (count + 1) / 2;
                count = 0;
            }
            before = color;
        }
        sum += (count + 1) / 2;
        so.println(sum);
    }
}
