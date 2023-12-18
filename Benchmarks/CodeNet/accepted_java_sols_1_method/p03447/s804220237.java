import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        System.out.println((X-A)%B);

        in.close();
    }
}
