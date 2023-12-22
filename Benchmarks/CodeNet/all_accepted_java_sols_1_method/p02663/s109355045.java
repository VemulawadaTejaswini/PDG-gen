import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H1 = sc.nextInt();
        int M1 = sc.nextInt();
        int H2 = sc.nextInt();
        int M2 = sc.nextInt();
        int K = sc.nextInt();

        if(M1 > M2) {
            M2 += 60;
            H1++;
        }

        if(H1 > H2) {
            H1 += 24;
        }

        int h = H2 - H1;
        int m = M2 - M1;

        int result = m + h*60 - K;

        result = Math.max(result, 0);

        System.out.println(result);
    }
}