import java.io.*;
import java.util.*;


public class Main {
    public static void main (String[]args)throws IOException {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        long answer=0;
        long bigYen=(x-(x%500))/500;
        answer+=bigYen*1000;
        long extra=x%500;
        extra-=extra%5;
        answer+=extra;
        System.out.println(answer);
    }
}
