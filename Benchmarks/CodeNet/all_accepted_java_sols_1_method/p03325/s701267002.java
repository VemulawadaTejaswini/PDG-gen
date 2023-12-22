import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++) {
            int A_i = sc.nextInt();
            while (A_i % 2 == 0) {
                A_i = A_i / 2;
                count++;
            }
        }

        System.out.println(count);
    }
}