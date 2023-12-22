import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int[] v = new int[3];
        for(int i = 0; i < 3; ++i) {
            v[i] = ReadInt();
        }
        Arrays.sort(v);
        System.out.println(v[0] + " " + v[1] + " " + v[2]);
    }
    static int ReadInt() throws IOException {
        return Integer.parseInt(sc.next());
    }
}