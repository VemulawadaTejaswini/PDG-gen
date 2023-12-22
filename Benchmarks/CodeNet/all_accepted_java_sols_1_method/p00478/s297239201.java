import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine()), res = 0;
        for (int i = 0; i < n; i++) {
            String ring = sc.nextLine();
            ring += ring;
            if (ring.contains(s)) {
                res += 1;
                continue;
            }
        }
        System.out.println(res);
    }
}