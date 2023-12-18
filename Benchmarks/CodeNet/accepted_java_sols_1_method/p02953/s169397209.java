import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        boolean isAns = true;
        if (n >= 2) {
            for (int i = n - 2; i >= 0; i--) {
                if (h[i] > h[i+1]) {
                    if (h[i]-1 <= h[i+1]) {
                        h[i]--;
                    } else {
                        isAns = false;
                        break;
                    }
                }
            }
        }

        System.out.println(isAns ? "Yes" : "No");
    }
}