import java.util.Scanner;

public class Main {

    private static int findPositiveIndex(int[] h) {
        for(int i = 0; i < h.length; i++) {
            if (h[i] > 0) return i;
        }
        return -1;
    }

    private static int solve(int[] h) {
        int cur = findPositiveIndex(h);
        int count = 0;

        while (cur >= 0) {
            for(int i = cur; i < h.length; i++) {
                if(h[i] > 0) {
                    h[i] -= 1;
                } else {
                    break;
                }
            }
            count += 1;
            cur = findPositiveIndex(h);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] h = new int[N];
        for(int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }

        int ans = solve(h);
        System.out.println(ans);
    }
}
