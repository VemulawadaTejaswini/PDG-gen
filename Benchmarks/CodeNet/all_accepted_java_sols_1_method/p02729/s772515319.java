import java.io.*;
import java.util.*;


public class Main {
    public static void main (String[]args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        System.out.println((N*(N-1)+(M*(M-1)))/2);
    }
}
