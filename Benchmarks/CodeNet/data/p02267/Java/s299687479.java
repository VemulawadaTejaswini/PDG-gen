import java.util.*;

public class Main {

    static int NOT_FOUND = 99999999;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sArr = new int[n];
        for (int i = 0; i < n; i++) {
            sArr[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] tArr = new int[q];
        int count = 0;
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            tArr[i] = x;
            if (linearSearch(sArr, x) != NOT_FOUND) count++;
        }
        System.out.println(count);
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return NOT_FOUND;
    }
}

