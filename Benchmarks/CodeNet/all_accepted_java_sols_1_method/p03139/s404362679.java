import java.util.*;
import java.io.*;

/*
   AtCoder contest
   coder : yoichidon
 */

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.printf("%d %d", Math.min(A,B), Math.max(0, A+B-N));
    }
}
