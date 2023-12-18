import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long[] a = new long[(int) N];
        for (long i = 0 ; i < N ; i++) {
            a[(int) i] = sc.nextInt();
        }

        long count = 0;
        long r = 0;
        long add = 0;
        long xor = 0;

        for (int i = 0 ; i < N ; i ++) {
            while (r < N) {
                if (add + a[(int) r] == (xor ^ a[(int) r])) {
                    add += a[(int) r];
                    xor = (int) (xor ^ a[(int) r]);
                    r++;
                } else {
                    break;
                }

            }
            count = count + r - i;
            add -= a[i];
            xor -= a[i];
        }
        System.out.println(count);
    }




}