package aoj;

import java.util.Scanner;

public class Main {
    Scanner sc;
    void run() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        A:
        for (int i=0;i<n;i++) {
            int[] box = new int[2];
            boolean flg = false;
            for (int h=0;h<10;h++) {
                int x = sc.nextInt();
                int p = 0;
                flg = false;
                for (int j=0;j<2;j++) {
                    if (box[p] < x) {
                        box[p] = x;
                        flg = true;
                        break;
                    }
                    else p = (p + 1) % 2;
                }
                if (!flg) {
                    System.out.println("NO");
                    break;
                }
            }
            if(flg) System.out.println("YES");
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}