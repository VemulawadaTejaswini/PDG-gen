import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Comparator.reverseOrder;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[]{1,2,4,8,16,32,64,128};
        for (int i = 0; i < 8; i++) {
            if (list[i] > n) {
                System.out.println(list[i-1]);
                return;
            }
        }
    }
}