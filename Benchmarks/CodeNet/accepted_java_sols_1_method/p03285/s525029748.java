import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int maxCake = N / 4;
        int maxDonut = N / 7;

        boolean can = false;
        for (int i_cake = 0; i_cake <= maxCake; i_cake++) {
            for (int i_donut = 0; i_donut <= maxDonut; i_donut++) {
                if (i_cake * 4 + i_donut * 7 == N) {
                    can = true;
                    break;
                }
            }
        }

        if (can) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}