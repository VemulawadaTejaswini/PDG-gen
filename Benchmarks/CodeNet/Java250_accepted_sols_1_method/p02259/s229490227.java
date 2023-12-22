import java.util.*;

public class Main {
    public static void main(String[] args) {
        int total;

        Scanner inp = new Scanner(System.in);
        total = inp.nextInt();

        int[] a = new int[total];

        for (int k = 0; k < total; k++) {
            a[k] = inp.nextInt();
        }

        int swapcount = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;

                    swapcount++;
                }
            }
        }

        for (int l = 0; l < total; l++) {
            if (l == 0) {
                System.out.printf("%d", a[l]);
            } else {
                System.out.printf(" %d", a[l]);
            }
        }

        System.out.printf("\n" + swapcount+"\n");
    }
}

