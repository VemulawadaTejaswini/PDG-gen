

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String[] line = in.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int x = Integer.parseInt(line[1]);
        int t = Integer.parseInt(line[2]);
        int full = n / x + (n % x != 0 ? 1 : 0);
        System.out.println(full * t);
    }
}
