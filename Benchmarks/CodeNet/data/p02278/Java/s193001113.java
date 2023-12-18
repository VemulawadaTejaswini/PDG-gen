import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] w = new Integer[n];
        for (int i = 0; i < n; i ++) {
            w[i] = sc.nextInt();
        }
        Integer[] sorted = Arrays.copyOf(w, n);
        Arrays.sort(sorted);

        int cost = 0;
        while (!Arrays.deepEquals(w, sorted)) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int i = 0; i < n; i++) {
                if (sorted[i] != w[i] && min > w[i]) {
                    min = w[i];
                    minIndex = i;
                }
            }

            int index = Arrays.asList(w).indexOf(sorted[minIndex]);
            if (index == -1) {
                System.out.println(minIndex + " " + w[minIndex] + " " + sorted[minIndex]);
            }
            int temp = w[minIndex];
            w[minIndex] = w[index];
            w[index] = temp;
            cost += w[minIndex] + w[index];
        }

        System.out.println(cost);


    }
}