import java.util.*;
import java.io.*;
import java.math.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();


        if (X == 2) {
            System.out.println(2);
            return;
        }
        if (X % 2 == 0) X += 1;

        int num = 1000000;
        boolean isPrime = false;
        for (int i = X; i <= num; i += 2) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if (isPrime) {
                System.out.println(i);
                break;
            }
        }

    }

}
