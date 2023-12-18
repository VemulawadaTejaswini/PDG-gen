import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();

        long diff = (B - A);
        if (diff % 2 == 0) {
            System.out.println(diff / 2);
        } else {
            long lefty = A - 1;
            long righty = N - B;
            long slide;
            if (lefty < righty) {
                slide = lefty;
                A -= slide;
                B -= slide + 1;
            } else {
                slide = righty;
                A += slide + 1;
                B += slide;
            }
            slide++;
            System.err.println(A + " " + B);
            diff = (B - A);
            System.err.println(diff);
            System.err.println(slide);
            System.out.println(diff / 2 + slide);
        }
    }
}
