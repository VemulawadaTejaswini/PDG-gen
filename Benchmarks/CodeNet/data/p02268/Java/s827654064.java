import java.util.Scanner;

public class Main {
    public static int n, q;
    public static int[] S = new int[100001];
    public static int[] T = new int[50001];
    public static void main(String[] args) {
        //データの読込
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }
        q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            T[i] = sc.nextInt();
        }
        //データの処理
        int cnt = 0;
        for (int i = 0; i < q; i++) {
            if (binarySearch(T[i])) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean binarySearch(int key) {
        int left = 0, right = n;
        int mid;

        while (left < right) {
            mid = (left + right) / 2;
            if (S[mid] == key) {
                return true;
            } else if (key < S[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }
}
