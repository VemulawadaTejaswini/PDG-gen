import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] haiku = new int[3];
        for (int i = 0; i < 3; i++) {
            haiku[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(haiku);

        PrintWriter out = new PrintWriter(System.out);
        if (haiku[0] == 5 && haiku[1] == 5 && haiku[2] == 7) {
            out.println("YES");
        } else {
            out.println("NO");
        }

        sc.close();
        out.flush();
    }
}