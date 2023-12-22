import java.io.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
//        int t = scr.nextInt();
//        while (t-- > 0)
        solve(scr);
    }


    static void solve(Scanner scr) {
        int N = scr.nextInt();
        int M = scr.nextInt();
        long a = N * (N - 1) / 2;
        long b = M * (M - 1) / 2;
        System.out.println(a+b);
    }


}



