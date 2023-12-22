import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int a = in.nextInt();
       int b = in.nextInt();
       if (a < b) System.out.println("a < b");
       else if(a > b) System.out.println("a > b");
       else System.out.println("a == b");
    }
}