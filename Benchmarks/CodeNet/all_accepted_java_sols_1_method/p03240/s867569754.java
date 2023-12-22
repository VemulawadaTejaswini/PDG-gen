import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] xi = new int[N];
        int[] yi = new int[N];
        int[] hi = new int[N];

        for(int i = 0; i < N; i++) {
            xi[i] = scanner.nextInt();
            yi[i] = scanner.nextInt();
            hi[i] = scanner.nextInt();
        }

//        int index = -1;
//        for(int i = 0; i < N; i++) {
//            if(hi[i] > 0) index = i; break;
//        }
//
//        for(int cx = 0; cx <= 100; cx++) {
//            for(int cy = 0; cy <= 100; cy++) {
//                int H = hi[index] + Math.abs(cx - xi[index]) + Math.abs(cy - yi[index]);
//                boolean stop = true;
//                for(int i = 0; i < N; i++) {
//                    if(hi[i] != Math.max(0, H - Math.abs(xi[i] - cx) - Math.abs(yi[i] - cy))) {
//                        stop = false;
//                        break;
//                    }
//                }
//                if(stop) {
//                    System.out.println(cx + " " + cy + " " + H);
//                    return;
//                }
//            }
//        }

        int xt = 0, yt = 0, ht = 0;
        for(int i = 0; i < N; i++) {
            if(hi[i] > 0) {
                xt = xi[i];
                yt = yi[i];
                ht = hi[i];
                break;
            }
        }

        for(int cx = 0; cx <= 100; cx++) {
            for(int cy = 0; cy <= 100; cy++) {
                int H = ht + Math.abs(xt - cx) + Math.abs(yt - cy);
                boolean stop = true;
                for(int i = 0; i < N; i++) {
                    if(hi[i] != Math.max(0, H - Math.abs(xi[i] - cx) - Math.abs(yi[i] - cy))) {
                        stop = false;
                        break;
                    }
                }
                if(stop) {
                    System.out.println(cx + " " + cy + " " + H);
                    return;
                }
            }
        }

    }
}