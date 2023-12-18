import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] ia;

        ia = in.readLine().split(" ");
        int a = Integer.parseInt(ia[0]);
        int b = Integer.parseInt(ia[1]);

        int c = a * b;
        int d = 2*a + 2*b;

        System.out.println("" + c + " " + d);
    }
}