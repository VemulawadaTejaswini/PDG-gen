

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int first = in.nextInt();
        final int v = in.nextInt();
        in.nextLine();
        final int second = in.nextInt();
        final int w = in.nextInt();
        in.nextLine();
        final int t = in.nextInt();
        if (v <= w) {
            System.out.println("NO");
        } else {
            final int diff = v - w;
            if (t * diff >= second - first) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
