import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int[] ar = new int[n];
        boolean[] b = new boolean[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt() - 1;
            b[i] = false;
        }
        int num = ar[0];
        while (true) {
            if (b[num] || b[1]) {
                break;
            }
            b[num] = true;
            num = ar[num];
            cnt++;
        }
        System.out.println(b[1]?cnt:-1);
        sc.close();
    }
}

class io {
    public static void br() {
        System.out.println("");
    }

    public static void YesNo(boolean f) {
        System.out.println(f ? "Yes" : "No");
    }

    public static void YESNO(boolean f) {
        System.out.println(f ? "YES" : "NO");
    }

}

class Algo {
    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }


}

