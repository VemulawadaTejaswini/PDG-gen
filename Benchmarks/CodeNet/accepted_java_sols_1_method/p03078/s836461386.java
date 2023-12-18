import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[x];
        long[] b = new long[y];
        long[] c = new long[z];
        for (int i = 0 ; i < x ; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0 ; i < y ; i++) {
            b[i] = sc.nextLong();
        }
        for (int i = 0 ; i < z ; i++) {
            c[i] = sc.nextLong();
        }
        long[] d = new long[x * y];
        int index = 0;
        for (int i = 0 ; i < x ; i++) {
            for (int j = 0 ; j < y ; j++) {
                d[index] = a[i] + b[j];
                index++;
            }
        }
        Arrays.sort(d);

        int xy = Math.min(x * y, k);
        long[] temp = new long[xy];
        for (int i = 0 ; i < xy ; i++) {
            temp[i] = d[x * y - 1 - i];
        }

        long[] e = new long[xy * z];
        index = 0;
        for (int i = 0 ; i < xy ; i++) {
            for (int j = 0 ; j < z ; j++) {
                e[index] = temp[i] + c[j];
                index++;
            }
        }

        Arrays.sort(e);

        for (int i = 0 ; i < k ; i++) {
            System.out.println(e[e.length - 1 - i]);
        }
    }

}