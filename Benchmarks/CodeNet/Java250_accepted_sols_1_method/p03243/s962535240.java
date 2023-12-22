import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        int x = 111;
        while (x < n) {
            x += 111;
        }
        System.out.println(x);
        sc.close();
    }
}
