import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n + 1];
        for (int i = 0; i < n  ; i++) {
          a [i] = in.nextInt();
        }
        Arrays.sort(a, 0 ,n);
        int b = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == a [i +1])
                i++;
            else {
                b ++;
            }

        }
        System.out.println(b);
    }
}










