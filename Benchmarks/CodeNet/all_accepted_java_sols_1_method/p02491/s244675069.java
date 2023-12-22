import java.io.*;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int a = Integer.parseInt(in.next());
        int b = Integer.parseInt(in.next());

        System.out.printf("%d %d %.5f", a/b, a%b, (double)a/b);
    }
}