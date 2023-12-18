import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int l, a, b, c, d;
        l = Integer.parseInt(sc.nextLine());
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());
        d = Integer.parseInt(sc.nextLine());
        while (a > 0 || b > 0) {
            l -= 1;
            a -= c;
            b -= d;
        }
        System.out.println(l);
    }
}