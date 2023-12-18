import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int left = 0;
        int[] w = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            sum += w[i];
            left = Math.max(left, w[i]);
        }
        left = Math.max(left, sum / k);
        int right = sum;

        while(left < right) {
            int mid = (left + right) / 2;
            if(possible(w, n, k, mid)) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }

        System.out.println(left);

        sc.close();
    }

    private static boolean possible(int[] w, int n, int k, int ans) {
        int tmp = ans;
        for(int i = 0; i < n; i++) {
            if(w[i] <= tmp) {
                tmp -= w[i];
            }else {
                if(k == 1) return false;
                k--;
                tmp = ans - w[i];
            }
        }
        return true;
    }
}
