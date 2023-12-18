
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
        String[] sp = s.split(" ");
        String ans = String.valueOf(Integer.parseInt(sp[0]) + Integer.parseInt(sp[1]));
        System.out.println(ans.length());
    }
}