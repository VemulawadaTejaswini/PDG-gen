import java.io.*;
import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int a = ReadInt();
        int b = ReadInt();
        int c = ReadInt();
        if( a < b && b < c ) {
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