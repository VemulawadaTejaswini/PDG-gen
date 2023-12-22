
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] argv) throws IOException {
        //*
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int lines = Integer.parseInt(in.readLine());
        for (int i = 0; i < lines; i++) {
            String s = in.readLine();
            if (s == null) {
                break;
            }
            f(s);
        }
        /*/
        f("4 3 5");
        f("4 3 6");
        f("8 8 8");
        //*/
    }

    public static void f(String s) {
        String[] sp = s.split(" ");
        int[] a = {Integer.parseInt(sp[0]),
                   Integer.parseInt(sp[1]),
                   Integer.parseInt(sp[2])};
        Arrays.sort(a);
        System.out.println(Math.pow(a[2], 2) == Math.pow(a[0], 2) + Math.pow(a[1], 2) ? "YES" : "NO");
    }
}