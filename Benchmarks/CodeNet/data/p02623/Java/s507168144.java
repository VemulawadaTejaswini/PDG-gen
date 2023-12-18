import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();

        }
        int i = 0, j = 0, count = 0;
        while (i < n || j < m) {
            if (i == n) {
                if (b[j] <= k) {
                    k = k - b[j];
                    count++;
                    j++;
                } else {
                    break;
                }
            }
            else if (j == m) {
                if (a[i] <= k) {
                    k = k - a[i];
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            else if (a[i] < b[j]) {
                if (a[i] <= k) {
                    k = k - a[i];
                    count++;
                    i++;
                } else {
                    break;
                }
            } 
            else if (b[j] <= a[i]) {
                if (b[j] <= k) {
                    k = k - b[j];
                    count++;
                    j++;
                } else {
                    break;
                }
            }
        }

        System.out.println(count);
    }
}