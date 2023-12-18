import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int a = ReadInt();
        int b = ReadInt();
        String str = String.format("%.6f", (double)a / b);
        System.out.println(a / b + " " + a % b + " " + str);
    }
    static int ReadInt() throws IOException {
        return Integer.parseInt(sc.next());
    }
}