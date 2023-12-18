import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int  min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; ++i) {
            int x = in.nextInt();
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        System.out.println(Math.abs(max - min));
    }
}