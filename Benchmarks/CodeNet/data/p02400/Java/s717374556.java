import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        double r = ReadDouble();
        String res1 = String.format("%.8f", r * r * Math.PI);
        String res2 = String.format("%.8f", 2 * r * Math.PI);
        System.out.println(res1 + " " + res2);
    }
    static int ReadInt() throws IOException {
        return Integer.parseInt(sc.next());
    }
    static double ReadDouble() throws IOException {
        return sc.nextDouble();
    }
}