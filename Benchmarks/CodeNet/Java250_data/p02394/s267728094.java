import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int W = ReadInt();
        int H = ReadInt();
        int x = ReadInt();
        int y = ReadInt();
        int r = ReadInt();
        if( r <= x && x <= W - r && r <= y && y <= H - r ) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    static int ReadInt() throws IOException {
        return Integer.parseInt(sc.next());
    }
}