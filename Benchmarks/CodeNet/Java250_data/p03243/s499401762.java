import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int res = -1;

        for (int i = 111; i < 1000; i += 111) {
            if (i >= N) {
                res = i;
                break;
            }
        }

        System.out.println(res);
    }
}