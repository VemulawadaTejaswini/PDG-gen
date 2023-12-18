import java.io.*;
import java.util.Scanner;
    
class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int a = ReadInt();
        int b = ReadInt();
        System.out.print(a * b + " " + (a + b) * 2 + "\n");
    }
    static int ReadInt() throws IOException {
        return Integer.parseInt(sc.next());
    }
}