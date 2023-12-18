import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int temp[] = new int[n];

        if (x > 300) {
            x = 300;
        }

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < array[j]; k++) {
                    if (j + k + 1 < n) {
                        temp[j + k + 1]++;
                    }
                }
            }
            for (int j = n; j > 0; j--) {
                for (int k = 0; k < array[j - 1]; k++) {
                    if (j - k - 2 > -1) {
                        temp[j - k - 2]++;
                    }
                }
            }
            for (int k = 0; k < n; k++) {
                temp[k]++;
                array[k] = temp[k];
            }

            for (int k = 0; k < n; k++) {
                temp[k] = 0;
            }

        }

        for (int k = 0; k < n; k++) {
            System.out.print(array[k] + " ");
        }

        sc.close();
    }

}