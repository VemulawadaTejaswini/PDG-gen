import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr = in.next().toCharArray();
        int x = 0;
        for (char c : arr) {
            if (c == '+') ++x;
            else --x;
        }

        System.out.println(x);
    }
}