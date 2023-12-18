import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        boolean[] div = new boolean[n];
        int[] counter = new int[1000001];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            counter[a[i]]++;
        }

        Arrays.sort(a);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (div[i] == false && counter[a[i]] == 1) {
                count++;
            }

            for (int j = i + 1; j < n; j++) {
                if (a[j] % a[i] == 0) {
                    div[j] = true;
                }
            }
        }

        System.out.println(count++);
    }
}