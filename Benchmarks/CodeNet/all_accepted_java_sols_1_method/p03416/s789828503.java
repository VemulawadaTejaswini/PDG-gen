import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    if (i * 10001 + j * 1010 + k * 100 >= a && i * 10001 + j * 1010 + k * 100 <= b) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}