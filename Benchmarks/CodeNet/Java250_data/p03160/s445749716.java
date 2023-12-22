

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) h[i] = in.nextInt();
        System.out.println(minCost(h, N));
    }

    public static int minCost(int[] h, int N) {
        int st1 = 0;
        int st2 = Math.abs(h[1] - h[0]);
        for (int i = 2; i < N; i++) {
            int next = Math.min(st2 + Math.abs(h[i] - h[i-1]), st1 + Math.abs(h[i] - h[i-2]));
            st1 = st2;
            st2 = next;
        }
        return st2;
    }
}
