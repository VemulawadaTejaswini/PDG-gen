/**
 * @author Vicfred
 * 11/3/18
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, T;
        N = scanner.nextInt();
        T = scanner.nextInt();
        int minima = 999999;
        boolean found = false;
        for(int i = 0; i < N; ++i) {
            int c, t;
            c = scanner.nextInt();
            t = scanner.nextInt();
            if(t > T)
                continue;
            minima = Math.min(minima, c);
            found = true;
        }
        if(found)
            System.out.println(minima);
        else
            System.out.println("TLE");
    }
}
