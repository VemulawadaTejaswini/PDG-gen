import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(sc.nextLine());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') s.setCharAt(i, '9');
            else if (s.charAt(i) == '9') s.setCharAt(i, '1');
        }
        System.out.println(s.toString());
        sc.close();
    }
}