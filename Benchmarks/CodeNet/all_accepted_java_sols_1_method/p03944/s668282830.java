import java.util.*;

class Main {
        public static void main(String args[]) {
                try (Scanner sc = new Scanner(System.in)) {
                        int W = sc.nextInt(), H = sc.nextInt(), N = sc.nextInt();
                        int Hmax = H, Hmin = 0, Wmax = W, Wmin = 0;
                        for (int i = 0; i < N; i++) {
                                int x = sc.nextInt(), y = sc.nextInt(), a = sc.nextInt();
                                if (a == 1) {
                                        Wmin = Math.max(x, Wmin);
                                } else if(a == 2) {
                                        Wmax = Math.min(x, Wmax);
                                } else if(a == 3) {
                                        Hmin = Math.max(y, Hmin);
                                } else {
                                        Hmax = Math.min(y, Hmax);
                                }
                        }
                        System.out.println(Math.max(0, (Hmax - Hmin)) * Math.max(0, (Wmax - Wmin)));
                }
        }
}