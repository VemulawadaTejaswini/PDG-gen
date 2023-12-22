import java.util.*;

public class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        long A0 = 0;
        long A1 = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a%2 == 0) {
                A0++;
            } else {
                A1++;
            }
        }
        long P0 = 0;
        long P1 = 0;
        if (P == 0) {
            P0 = (long) Math.pow(2, A0);
            P1 = (long) Math.pow(2, A1)/2;
            if (P1 == 0) {
                P1 = 1;
            }
            System.out.println(P0*P1);
        } else {
            P0 = (long) Math.pow(2, A0);
            P1 = (long) Math.pow(2, A1)/2;
            System.out.println(P0*P1);
        }
    }
}
