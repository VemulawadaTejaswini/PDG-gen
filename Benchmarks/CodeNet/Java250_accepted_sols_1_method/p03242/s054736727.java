import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] digits = new int[3];

        for (int i = 2; i >= 0; i--) {
           digits[i] = n % 10;
           if (digits[i] == 1) {
               digits[i] = 9;
           } else {
               digits[i] = 1;
           }
           n = n / 10;
        }
        System.out.println(digits[0] + "" + digits[1] + "" + digits[2]);
    }
}