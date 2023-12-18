/**
 * A
 */
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
    
        String next = scanner.nextLine();
        int left = 1000 - Integer.parseInt(next) % 1000;
        System.out.println(left);        
        scanner.close();
    }

}