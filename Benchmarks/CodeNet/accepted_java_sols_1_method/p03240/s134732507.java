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

        int X = 0, Y = 0, h = 0;
        for(int i = 0; i < N; i++) {
            if(hi[i] > 0) {
                X = xi[i];
                Y = yi[i];
                h = hi[i];
                break;
            }
        }

        for(int cx = 0; cx <= 100; cx++) {
            for(int cy = 0; cy <= 100; cy++) {
                int H = h + Math.abs(X - cx) + Math.abs(Y - cy);
                boolean ok = true;
                for(int i = 0; i < N; i++) {
                    if(hi[i] != Math.max(0, H - Math.abs(xi[i] - cx) - Math.abs(yi[i] - cy))) {
                        ok = false;
                        break;
                    }
                }
                if(ok) {
                    System.out.println(cx + " " + cy + " " + H);
                    return;
                }
            }
        }
    }
}
