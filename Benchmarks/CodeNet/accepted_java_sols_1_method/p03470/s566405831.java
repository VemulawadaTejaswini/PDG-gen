import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer arr[] = new Integer[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        int layer = 1;
        for (int i = 1; i < n; ++i) {
            if (arr[i-1] > arr[i]) ++layer;
        }

        System.out.println(layer);
    }
}