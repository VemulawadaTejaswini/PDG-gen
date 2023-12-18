import java.io.*;
import java.util.*;

public class problemA {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int t = 1;
//        t = in.nextInt();
        while (t != 0) {
            play();
            t--;
        }
    }

    public static void play() throws IOException {
        String s = in.readLine();
        if ('A' <= s.charAt(0) && 'Z' >= s.charAt(0))
            System.out.println("A");
        else
            System.out.println("a");
    }
}

