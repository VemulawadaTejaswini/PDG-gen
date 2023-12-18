import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        int parent = 0;
        int[] a = new int[n+1];
        int[] max = new int[n+1];
        for (int i = 0; i <= n; i++) {
            a[i] = sc.nextInt();
            max[i] = (parent == 0) ? 1 : parent * 2;
            if (a[i] > max[i]) {
                result = -1;
                break;
            }
            parent = max[i] - a[i];
            if (parent == 0 && i != n) {
                result = -1;
                break;
            }
        }
        if (result != -1) {
            int leaf = 0;
            for (int i = n; i >= 0; i--) {
                leaf += a[i];
                int node = (leaf < max[i]) ? leaf : max[i];
                result += node;
            }
        }

        System.out.println(result);
    }
}