import java.util.Scanner;
 
public class Main {
    private static int partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p - 1;
        for(int j = p; j < r; j++) {
            if(a[j] <= x) {
                i++;
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        int tmp = a[i + 1];
        a[i + 1] = a[r];
        a[r] = tmp;
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int q = partition(a, 0, n - 1);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(i != 0) sb.append(" ");
            if(i == q) sb.append("[").append(a[i]).append("]");
            else sb.append(a[i]);
        }
        System.out.println(sb);

        sc.close();
    }
}

