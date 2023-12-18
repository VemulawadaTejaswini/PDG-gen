import java.io.*;
import java.util.*;

public class Main {
    public static void main (String[]args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        n=n%k;
        System.out.println(Math.min(n,Math.abs(n-k)));
    }
}
