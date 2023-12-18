
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long y = 1;
        for(long x =n; 0<x; x--)
           y =y*x;
        System.out.println(y);
        
    }
}

