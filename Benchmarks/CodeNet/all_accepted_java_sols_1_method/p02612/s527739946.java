/**
 * A
 */
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
    
        int next = scanner.nextInt();
        int left = 1000 - (next % 1000);
        System.out.println(left == 1000 ? 0 : left);
        scanner.close();
    }

}