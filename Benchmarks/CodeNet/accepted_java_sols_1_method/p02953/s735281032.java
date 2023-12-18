import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] h = new int[N];

        for (int i=0; i<N; i++) {
            h[i] = sc.nextInt();
        }
        
        for (int i=N-1; i>0; i--) {
            if (h[i] - h[i-1] > -1) {
                continue;
            }

            if (h[i] - h[i-1] == -1) {
                h[i-1]--;
                continue;
            }

            if (h[i] - h[i-1] < -1) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        return;
    }
}

