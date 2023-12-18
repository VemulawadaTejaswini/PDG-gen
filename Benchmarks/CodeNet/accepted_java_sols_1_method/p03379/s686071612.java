import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int [] x = new int[n];
        int [] xSorted = new int[n];
        for (int i = 0; i < n; i++) {
            int m = cin.nextInt();
            x[i] = m;
            xSorted[i] = m;
        }
        Arrays.sort(xSorted);
        int center = n / 2;
        for (int i = 0; i < n; i++) {
            int rank = Arrays.binarySearch(xSorted, x[i]);
            if (rank < center) {
                System.out.println(xSorted[center]);
            } else {
                System.out.println(xSorted[center - 1]);
            }
        }
    }
}
