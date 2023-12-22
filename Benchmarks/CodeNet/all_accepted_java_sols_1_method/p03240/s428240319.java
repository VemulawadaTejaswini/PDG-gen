import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] xi = new int[n];
        int[] yi = new int[n];
        int[] hi = new int[n];
 
        for(int i = 0; i < n; i++) {
            xi[i] = scanner.nextInt();
            yi[i] = scanner.nextInt();
            hi[i] = scanner.nextInt();
        }

        int xt = 0, yt = 0, ht = 0;
        for(int i = 0; i < n; i++) {
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
                boolean check = true;
                for(int i = 0; i < n; i++) {
                    if(hi[i] != Math.max(0, H - Math.abs(xi[i] - cx) - Math.abs(yi[i] - cy))) {
                        check = false;
                        break;
                    }
                }
                if(check) {
                    System.out.println(cx + " " + cy + " " + H);
                    return;
                }
            }
        }
    }
}