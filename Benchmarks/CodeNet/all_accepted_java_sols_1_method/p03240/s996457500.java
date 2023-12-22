import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];
        int offset = 1000000000;
        for(int i=0; i<n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextInt();
            offset = Math.min(offset, h[i]);
        }
        for(int i=0; i<n; i++) {
            h[i] -= offset;
        }
        for(int cx = 0; cx <= 100; cx++) {
            for(int cy = 0; cy <= 100; cy++) {
                A: for(int ch = 0; ch <= 200; ch++) {
                    for(int i=0; i<n; i++) {
                        int hh = ch - Math.abs(cx - x[i]) - Math.abs(cy - y[i]);
                        hh = Math.max(hh, -offset);
                        if(hh != h[i]) continue A;
                    }
                    System.out.println(String.format("%d %d %d", cx, cy, ch + offset));
                    return;
                }
            }
        }

    }

}
