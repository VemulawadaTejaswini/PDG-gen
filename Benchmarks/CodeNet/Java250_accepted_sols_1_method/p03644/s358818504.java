
import java.util.*;
import java.lang.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int maxD = 1;


        while (maxD <= N) {
            maxD *= 2;
        }

        System.out.println(maxD/2);
    }
}