import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.close();

        int mCount = 0;
        int nCount = 0;
        if (M < 2) {
            mCount = 0;
        }
        if (nCount < 2) {
            nCount = 0;
        }

        mCount = M * (M - 1) / 2;
        nCount = N * (N - 1) / 2;

        System.out.println(mCount + nCount);
    }

}
