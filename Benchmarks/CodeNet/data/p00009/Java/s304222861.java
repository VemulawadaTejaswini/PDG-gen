
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] argv) throws IOException {
        //*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String s = in.readLine();
            if (s == null) {
                break;
            }
            f(s);
        }
        //*/
    }

    public static void f(String s) {
        int[] p = new int[1000000];
        Arrays.fill(p, 1);
        p[0] = 0;
        p[1] = 0;
        int count = 0;
        for (int i = 2; i < 1000000; i++) {
            if (p[i] != 0) {
                count++;
                p[i] = count;
                for (int j = i * 2; j < 1000000; j+=i) {
                    p[j] = 0;
                }
            }
        }
        for (int i = Integer.parseInt(s); i >= 0; i--) {
            if (p[i] != 0) {
                System.out.println(p[i]);
                return;
            }
        }
        System.out.println(0);
    }
}