import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        final int A = Integer.parseInt(sc.next());
        final int B = Integer.parseInt(sc.next());

        out.println(A * B - (A + B) + 1);

        out.flush();
    }
}