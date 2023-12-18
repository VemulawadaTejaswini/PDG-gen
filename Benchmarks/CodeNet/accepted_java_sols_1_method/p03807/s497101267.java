import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        long[] a = new long[n];

        for(int i=0; i<n; i++) {
            a[i] = sc.nextLong();
        }

        int oddCnt = 0;
        int evenCnt = 0;
        for(long l: a) {
            if(l % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }

        if(oddCnt % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
