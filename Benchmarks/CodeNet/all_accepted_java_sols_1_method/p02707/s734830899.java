
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n = in.nextInt();
        int[] result = new int[n];
        for (int i = 0; i < n - 1; i++) {
            result[in.nextInt() - 1]++;
        }
        for (int i = 0; i < result.length; i++) {
            out.println(result[i]);
        }

        out.close();
    }
}