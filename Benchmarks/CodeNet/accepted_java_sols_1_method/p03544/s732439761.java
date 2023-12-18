import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] lArr = new long[n+1];

        lArr[0] = 2;
        lArr[1] = 1;
        for (int i = 2; i <= n; i++) {
            lArr[i] = lArr[i-1] + lArr[i-2];
        }

        System.out.println(lArr[n]);
    }
}
