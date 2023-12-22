import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = a + b;
        max = Math.max(a - b, max);
        max = Math.max(a * b, max);

        System.out.println(max);



    }
}