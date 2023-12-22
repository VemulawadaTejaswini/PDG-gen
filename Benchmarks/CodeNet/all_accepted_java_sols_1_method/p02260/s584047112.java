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

        for (int i = 0; i < a.length-1; i++) {
            int mini = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[mini]) {
                    mini = j;
                }
            }

            if (i != mini) {
                int temp = a[i];
                a[i] = a[mini];
                a[mini] = temp;

                swapcount++;
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

