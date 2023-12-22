import java.util.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int a[] = new int[4];
        for (int i = 3; i >= 0; i--) {
            a[i] = n % (int) Math.pow(10, 4 - i);
            a[i] = a[i] / (int) Math.pow(10, 3 - i);
            //out.println(a[i]);
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    int now = a[0];
                    now += (i == 0 ? a[1] : -a[1]);
                    now += (j == 0 ? a[2] : -a[2]);
                    now += (k == 0 ? a[3] : -a[3]);
                    if (now == 7) {
                        out.print(a[0]);
                        if (i == 0) out.print('+');
                        else out.print('-');
                        out.print(a[1]);
                        if (j == 0) out.print('+');
                        else out.print('-');
                        out.print(a[2]);
                        if (k == 0) out.print('+');
                        else out.print('-');
                        out.println(a[3] + "=7");
                        return;
                    }
                }
            }
        }
    }
}
