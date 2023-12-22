
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int [] a_1 = new int [N];
        int [] a_2 = new int [N];
        for (int i = 0 ; i < N ; i++) {
            a_1[i] = sc.nextInt();
        }
        int initCandy = a_1[0];
        for (int i = 0 ; i < N ; i++) {
            int a = sc.nextInt();
            a_2[i] = a;
            initCandy += a;
        }
        int maxCandy = initCandy;
        for (int i = 1 ; i < N  ; i ++) {
            initCandy = initCandy + a_1[i] - a_2[i - 1];
            maxCandy = Math.max(maxCandy, initCandy);
        }
        System.out.println(maxCandy);
    }

}