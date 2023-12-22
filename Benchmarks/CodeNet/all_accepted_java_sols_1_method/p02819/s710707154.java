import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static int mod = (int) 10e8 + 7;

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i = n; i <= Integer.MAX_VALUE; i++) {
            boolean isPrime = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.println(i);
                return;
            }
        }
    }

}
