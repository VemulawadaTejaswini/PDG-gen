import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long Bx100 = Long.valueOf(sc.next().replace(".", ""));

        System.out.println(A*Bx100/100);
    }
}
