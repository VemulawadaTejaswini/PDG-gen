import java.io.*;
import java.util.Scanner;

class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int a = ReadInt();
        int b = ReadInt();
        if( a < b ) {
            System.out.println("a < b");
        }
        else if( a == b ) {
            System.out.println("a == b");
        }
        else {
            System.out.println("a > b");
        }
    }
    static int ReadInt() throws IOException {
        return Integer.parseInt(sc.next());
    }
}