import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class Main {
    static long[][] selfCon, selfUncon;
    static long mod = 1000000000+7;
    static int n;
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(),  B = sc.nextInt(),T = sc.nextInt();
        int ans = T/A*B;
        System.out.println(ans);
    }
}
